package com.pankx.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 传统文件上传
     * @return
     */
    @RequestMapping("/fileupload1")
    public String fileupload1(HttpServletRequest request) throws Exception {
    System.out.println("fileupdate执行了。。。。");

//        使用fileLoad组件完成文件上传
//        上传到的位置
        String path = request.getSession().getServletContext().getRealPath("uploads/");
//        判断路径是否存在
        File file = new File(path);
        if(!file.exists()){
//            如何不存在就创建文件目录
            file.mkdirs();
        }
//        解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
//        解析request
        List<FileItem> items = upload.parseRequest(request);
        for(FileItem item:items){
//            判断item对象是否为上传文件项
            if(item.isFormField()){
//                为普通表单项
            }else{
//                为上传文件项
//                获取文件名称
                String filename = item.getName();
//                设置图片名称为唯一值，UUID
                String uuid = UUID.randomUUID().toString().replace("-","");
//                拼接文件名
                filename = uuid+"_"+filename;
//                写入文件
                item.write(new File(path,filename));
//                删除缓存文件
                item.delete();
            }
        }

        return "success";
    }

    /**
     * springmvc文件上传实例
     * @return
     */
    @RequestMapping("/fileupload2")
    public String fileload2(HttpServletRequest request,MultipartFile upload) throws IOException {
        System.out.println("fileload2执行。。。");
//        设置上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
//        获取上传文件的名称
        String fileName = upload.getOriginalFilename();
//        完成文件上传
        upload.transferTo(new File(path,fileName));
        return "success";
    }

    /**
     * 跨服务上传文件,要把Tomcat服务器的只读属性设置为false,否则会报405 Method Not Allowed错误
     * @param upload
     * @return
     * @throws IOException
     */
    @RequestMapping("/fileupload3")
    public String fileupload3(MultipartFile upload) throws IOException {

        String path = "http://localhost:8090/uploads/";
//        获取文件的名称
        String filename = upload.getOriginalFilename();
//        创建客户端对象
        Client client = Client.create();
//        连接文件服务器
       WebResource resource = client.resource(path+filename);
//       上传文件到文件服务器
        resource.put(upload.getBytes());
        return "success";
    }
}
