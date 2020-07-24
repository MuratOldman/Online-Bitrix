package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StreamActivity_TaskTabPage {

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[1]")
    public WebElement ActivityStream;
    //TASK TAB

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']/span")
    public WebElement taskTab;

    @FindBy(xpath = "//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement thingsToDoText;

    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriorityCheckBox;

    @FindBy(xpath = "//label[.='High Priority']")
    public WebElement highPrioritySign;

    @FindBy(xpath = "(//span[@title='Visual editor'])[3]")
    public WebElement visualEditorIconTask;
    @FindBy(id = "bx-html-editor-tlbr-lifefeed_task_form")
    public WebElement visualEditorTextBar;

    @FindBy(xpath = "(//span[@title='Upload files'])[3]")
    public WebElement uploadFilesIconTask;

    @FindBy(xpath = "(//input[@name='bxu_files[]'])[1]")
    public WebElement uploadFilesAndImagesFromTask;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement expectedUploadedFileName; //file name should be contained int this path

    @FindBy(xpath = "(//span[@title='Quote text']/i)[3]")
    public WebElement quoteTextIcon;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteInputBox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@class='feed-task-info-text-title']/a")
    public WebElement ThingsToDoTextQuote; //to verify if quote is created ...represents task name

    @FindBy(xpath = "(//span[@title='Add mention'])[2]")
    public WebElement addMentionIcon;

    @FindBy(id = "BXSocNetLogDestination")
    public WebElement windowOptionsToSelectContacts;

    @FindBy(xpath = "//a[contains(@id,'destDepartmentTab')]")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "//span[contains(@id,'bxid')]")
    public WebElement mention;

    @FindBy(xpath = "(//span[@title='Link']/i)[2]")
    public WebElement linkIcon;

    @FindBy(xpath = "//div[@class='bx-core-adm-dialog-content-wrap-inner']")
    public WebElement linkWindow;

    @FindBy(xpath = "//input[@id='linklifefeed_task_form-text']")
    public WebElement textInputBoxFromLinkIcon;

    @FindBy(xpath = "//input[@id='linklifefeed_task_form-href']")
    public WebElement LinkInputBox;

    @FindBy(id = "undefined")
    public WebElement saveButtonFromLinkIcon;

    @FindBy(xpath = "//a[contains(@title,'Link:')]")
    public WebElement linkPath;//to verify if created link is displayed or not it also contains link text

    @FindBy(xpath = "//span[.='Checklist']")
    public WebElement checkList;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-i-number']")
    public WebElement checkListItems;

    @FindBy(xpath = "(//span[.='separator'])[2]")
    public WebElement separator;

    @FindBy(xpath = "(//span[@class='js-id-checklist-is-i-delete task-field-title-del tasks-btn-delete'])[4]")
    public WebElement xMark3rdItem;


}
