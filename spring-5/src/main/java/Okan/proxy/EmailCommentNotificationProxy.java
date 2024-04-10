package Okan.proxy;

import Okan.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment"+ comment.getText());

    }
}
