package Okan.proxy;

import Okan.model.Comment;

public class PushCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending push notification for comment:"+ comment.getText());

    }
}
