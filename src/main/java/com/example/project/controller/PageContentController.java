package com.example.project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.Faqs;
import com.example.project.model.PageContentTypeEnum;
import com.example.project.model.Page_content;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.DaoFactory;
import com.example.project.util.ServiceRegistry;

@RestController
public class PageContentController {

	@Autowired
	private DaoFactory daoFactory;
	
	@Autowired
	private ServiceRegistry serviceRegistry;
	
	//-------------------------------------------------------------------------
	  @GetMapping(ApplicationURLConstants.PAGECONTENT_ABOUTUS)
	  public ModelAndView loadAboutUs() {
		
		  ModelAndView mv=new ModelAndView();
		  try {
			  
			  //System.err.println(PageContentTypeEnum.AboutUs.getType());

			  Page_content page_content=daoFactory.pageContentRepository.findByType(PageContentTypeEnum.AboutUs.getType());
			  
			
			  
			  mv.addObject("pagecontent",page_content);
			  
			  
	  mv.setViewName("pagecontent/aboutus");
	  System.out.println("hello");
	  
	  }catch (Exception e) 
		  {
		  System.out.println(e); 
		  }
		  return mv;
		 }
	  
	  
	  @PostMapping(ApplicationURLConstants.PAGECONTENT_ABOUTUS)
	  public ModelAndView processAboutUs(@ModelAttribute Page_content page_content) {
		  ModelAndView mv=new ModelAndView();
		  
	
		  //Page_content page_content= daoFactory.pageContentRepository.findByType(PageContentTypeEnum.AboutUs.getType());
		  
			  page_content.setType(PageContentTypeEnum.AboutUs.getType());
			  daoFactory.pageContentRepository.save(page_content);
			  
		  
			  mv.addObject("pagecontent",page_content);
		  mv.setViewName("pagecontent/aboutus");
		  return mv;
		  
	  }
	  
	//  ------------------------------------------------------------------------------------
	  @GetMapping(ApplicationURLConstants.PAGECONTENT_PRIVACYPOLICY)
	  public ModelAndView loadPrivacyPolicy() {
		
		  ModelAndView mv=new ModelAndView();
		  try {

			  Page_content page_content=daoFactory.pageContentRepository.findByType(PageContentTypeEnum.PrivacyPolicy.getType());
			  
			
				/* System.err.println(page_content); */
			  mv.addObject("pagecontent",page_content);

	  mv.setViewName("pagecontent/privacypolicy");
	
	  
	  }catch (Exception e) 
		  {
		  System.out.println(e); 
		  }
		  return mv;
		 }
	  
	  @PostMapping(ApplicationURLConstants.PAGECONTENT_PRIVACYPOLICY)
	  public ModelAndView processPrivacyPolicy(@ModelAttribute Page_content page_content) {
		 ModelAndView mv= new ModelAndView();
		  
		  System.out.println("called");
		  //Page_content page_content= daoFactory.pageContentRepository.findByType(PageContentTypeEnum.AboutUs.getType());
		  
			  page_content.setType(PageContentTypeEnum.PrivacyPolicy.getType());
			  daoFactory.pageContentRepository.save(page_content);
			
			  mv.addObject("pagecontent",page_content);
		  mv.setViewName("pagecontent/privacypolicy");
		  return mv;
	  }
	  

	  
	//--------------------------------------------------------------------------------------------------------
	  @GetMapping(ApplicationURLConstants.PAGECONTENT_TERMSCONDITION)
	  public ModelAndView loadTermsAndCondition() {
		
		  ModelAndView mv=new ModelAndView();
		  try {

			  Page_content page_content=daoFactory.pageContentRepository.findByType(PageContentTypeEnum.TermsCondition.getType());
			  
				/*
				 * System.err.println(page_content);
				 */
			  mv.addObject("pagecontent",page_content);
	  mv.setViewName("pagecontent/term&condition");
		/* System.out.println("hello"); */
	  
	  }catch (Exception e) 
		  {
		  System.out.println(e); 
		  }
		  return mv;
		 }
	  
	  @PostMapping(ApplicationURLConstants.PAGECONTENT_TERMSCONDITION)
	  public ModelAndView processTermsCondition(@ModelAttribute Page_content page_content) {
		 ModelAndView mv= new ModelAndView();
		  
			/* System.out.println("called"); */
		  //Page_content page_content= daoFactory.pageContentRepository.findByType(PageContentTypeEnum.AboutUs.getType());
		  
			  page_content.setType(PageContentTypeEnum.TermsCondition.getType());
			  daoFactory.pageContentRepository.save(page_content);
			  
		  
			  mv.addObject("pagecontent",page_content);
		  mv.setViewName("pagecontent/term&condition");
		  return mv;
	  }
		//--------------------------------------------------------------------------------------------------------
	  @GetMapping(ApplicationURLConstants.PAGECONTENT_ADDFAQS)
	  public ModelAndView loadAddFAQs()
	  {
	  
	  ModelAndView mv=new ModelAndView();
	  try {
		  
		  mv.addObject("faqs",new Faqs());
		  
	  mv.setViewName("pagecontent/addfaqs"); 
		/* System.out.println("hello"); */
	
	  
	  }
	  catch (Exception e)
	  {
		  System.out.println(e);
		  } 
	  return mv;
	  }
	  
	  
	  @PostMapping(ApplicationURLConstants.PAGECONTENT_ADDFAQS)
	  public ModelAndView processAddFAQs(@ModelAttribute Faqs faqs)
	  {
	  
	  ModelAndView mv=new ModelAndView();
	  
		/* System.err.println("called"); */
	
		  serviceRegistry.faqsService.saveFAQS(faqs);
		  
	  mv.setViewName("pagecontent/Faqslist"); 
	  
	 
	  return mv;
	  }
	  
		
	  @GetMapping(ApplicationURLConstants.PAGECONTENT_UPDATEFAQS_PATH)
	  public ModelAndView loadUpdateFAQs(@PathVariable(name="id") Long id) 
	  {
	  
	  ModelAndView mv=new ModelAndView();
	  try {
		  mv.addObject("faqs",serviceRegistry.faqsService.getById(id));
	  mv.setViewName("pagecontent/updatefaqs"); 
	  //System.out.println("hello");
	
	  
	  }
	  catch (Exception e)
	  {
		  System.out.println(e);
		  } 
	  return mv;
	  }
	  
	  
	  @PostMapping(ApplicationURLConstants.PAGECONTENT_UPDATEFAQS)
	  public ModelAndView processUpdateFAQs(@ModelAttribute Faqs faqs)
	  {
	  
	  ModelAndView mv=new ModelAndView();
	  
		/* System.err.println("called"); */
	
		  serviceRegistry.faqsService.saveFAQS(faqs);
		  
	  mv.setViewName("pagecontent/Faqslist"); 
	  
	 
	  return mv;
	  }
	 
	  
	  
		@GetMapping(ApplicationURLConstants.PAGECONTENT_PAGECONTENT_FAQSLIST)
		public DataTablesOutput<Faqs> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput) {
			/*
			 * System.out.println("called");
			 */
			return serviceRegistry.faqsService.getAllByActiveTrue(dataTablesInput);

		}

		
		  @GetMapping(ApplicationURLConstants.PAGECONTENT_FAQSLIST) 
		  public ModelAndView getFAQsListPage() {
		  ModelAndView mv = new ModelAndView();
		  
			/* System.err.println("called"); */ 
		  mv.setViewName("pagecontent/Faqslist");
		  return mv;
		  }
		  
		  
			
			  @PostMapping(ApplicationURLConstants.PAGECONTENT_DELETEFAQS_PATH)
			  public  ModelAndView deleteFAQs(@PathVariable Long id) { 
				  ModelAndView mv=new ModelAndView();
			  
			  Faqs faqs=serviceRegistry.faqsService.findById(id);
			  faqs.setActive(false);
			 serviceRegistry.faqsService.saveFAQS(faqs);
		 
	
			mv.setViewName("redirect:/pagecontent/pagecontent/Faqslist");
			/*
			 * System.err.println("called");
			 */
			 return mv; 
			 }
			 
	
}
