package com.liuzhilun.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuzhilun.model.Book;
import com.liuzhilun.service.BookService;

@Controller
@RequestMapping
public class BookController {

  private BookService bookService;
  @RequestMapping("/getSysReal")
  public @ResponseBody void getSysReal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
    System.out.println("bookname:");
    System.out.println("author:");
  }
  @RequestMapping(params = "method=update")
  public String update(Book book) {
    return "success";
  }
  public BookService getBookService() {
    return bookService;
  }
  @Resource
  public void setBookService(BookService bookService) {
    this.bookService = bookService;
  }
  
}