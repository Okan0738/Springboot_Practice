package Okan;

import Okan.config.CommentConfig;
import Okan.service.CommentService;
import Okan.model.Comment;
import Okan.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {


    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(CommentConfig.class);
        CommentService commentService= context.getBean(CommentService.class);

    }
}
