package Okan.proxy;

import Okan.model.Comment;

public interface CommentNotificationProxy {
  void sendComment(Comment comment);

}
