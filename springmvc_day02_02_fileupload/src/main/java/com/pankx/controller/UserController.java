package com.pankx.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 文件上传
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
}
