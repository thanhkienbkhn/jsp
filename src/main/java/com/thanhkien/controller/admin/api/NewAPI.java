package com.thanhkien.controller.admin.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thanhkien.model.UserModel;
import com.thanhkien.service.INewService;
import com.thanhkien.service.impl.NewService;
import com.thanhkien.utils.database.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet {

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        // when server responses to client, tells client that this is json data type
        resp.setContentType("application/json");

        UserModel userModel = HttpUtil.of(req.getReader()).toModel(UserModel.class);
        INewService service = new NewService();
        userModel = (UserModel) service.save(userModel);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getOutputStream(), userModel);

    }


    // fragment

    @Override
    protected void doDelete(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    protected void doPut(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        UserModel userModel = HttpUtil.of(req.getReader()).toModel(UserModel.class);
        INewService service = new NewService();
        userModel = (UserModel) service.update(userModel);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getOutputStream(), userModel);
    }

}
