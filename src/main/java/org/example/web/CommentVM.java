package org.example.web;

import org.example.model.Client;
import org.example.model.Comment;
import org.example.repository.CommentRepository;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Window;
//import ru.simplex_software.mailform2.model.Client;
//import ru.simplex_software.mailform2.model.Comment;
//import ru.simplex_software.mailform2.repository.CommentRepository;

import java.time.Instant;
import java.util.List;


@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class CommentVM {

    @WireVariable
    private CommentRepository commentRepository;
    private List<Comment> comments;
    private Comment comment;
    private Comment selectedComment;

    private String commentText;
    private Instant commentDate = Instant.now();

    private Client client;

//    @NotifyChange("selectedComment")
//    @Command
//    public void saveOrder() {
//        save();
//    }
//
//
//    @NotifyChange("selectedComment")
//    @Command
//    public void select(@BindingParam("comment") Comment comment) {
//        selectedComment = comment;
//    }


    @Init
    public void init() {
        comments = commentRepository.findAllComment();
    }


    /**
     * открывает форму комментария
     */
    @Command
    public void createNewComment() {
        final Window win = (Window) Executions.createComponents("/admin/commentnew.zul", null, null);
        update();
    }


    /**
     * изменить комментарий к выбранному клиенту
     */
    @Command
    public void update() {
        comment.setClient(selectedComment.getClient());
        comment.setComment("update test");
        commentRepository.save(comment);
    }


    /**
     * новый комментарий к выбранному клиенту
     */
    @Command
    public void save() {
        comment = new Comment();
        comment.setClient(selectedComment.getClient());
        comment.setComment("новый тестовый комментарий");
        commentRepository.save(comment);
    }

    /**
     * просмотр комментария к выбранному клиенту
     */
    @Command
    public void view() {
        comment = new Comment(selectedComment.getClient(),selectedComment.getComment());
//        comment.setClient(selectedComment.getClient());
//        comment.setComment(selectedComment.getComment());
    }



    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public void setCommentRepository(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getSelectedComment() {
        return selectedComment;
    }

    public void setSelectedComment(Comment selectedComment) {
        this.selectedComment = selectedComment;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Instant getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Instant commentDate) {
        this.commentDate = commentDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}