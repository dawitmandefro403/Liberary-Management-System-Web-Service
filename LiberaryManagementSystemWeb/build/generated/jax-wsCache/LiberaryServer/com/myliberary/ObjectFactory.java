
package com.myliberary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.myliberary package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateBook_QNAME = new QName("http://liberary.demo/", "updateBook");
    private final static QName _InsertReturnDetail_QNAME = new QName("http://liberary.demo/", "insertReturnDetail");
    private final static QName _InsertReturnDetailResponse_QNAME = new QName("http://liberary.demo/", "insertReturnDetailResponse");
    private final static QName _IssuedByStudentIdResponse_QNAME = new QName("http://liberary.demo/", "issuedByStudentIdResponse");
    private final static QName _DeleteIssue_QNAME = new QName("http://liberary.demo/", "deleteIssue");
    private final static QName _BookDetailByName_QNAME = new QName("http://liberary.demo/", "bookDetailByName");
    private final static QName _IssuedByBookId_QNAME = new QName("http://liberary.demo/", "issuedByBookId");
    private final static QName _BookDetailByNameResponse_QNAME = new QName("http://liberary.demo/", "bookDetailByNameResponse");
    private final static QName _DeleteIssueResponse_QNAME = new QName("http://liberary.demo/", "deleteIssueResponse");
    private final static QName _IssuedByStudentId_QNAME = new QName("http://liberary.demo/", "issuedByStudentId");
    private final static QName _StudentRegisterResponse_QNAME = new QName("http://liberary.demo/", "studentRegisterResponse");
    private final static QName _BookDetailByStreamResponse_QNAME = new QName("http://liberary.demo/", "bookDetailByStreamResponse");
    private final static QName _StudentReturnResponse_QNAME = new QName("http://liberary.demo/", "studentReturnResponse");
    private final static QName _StudentReturn_QNAME = new QName("http://liberary.demo/", "studentReturn");
    private final static QName _StudentRegister_QNAME = new QName("http://liberary.demo/", "studentRegister");
    private final static QName _AddBookResponse_QNAME = new QName("http://liberary.demo/", "addBookResponse");
    private final static QName _InsertIssueBookResponse_QNAME = new QName("http://liberary.demo/", "insertIssueBookResponse");
    private final static QName _InsertIssueBook_QNAME = new QName("http://liberary.demo/", "insertIssueBook");
    private final static QName _IssueBookDetailResponse_QNAME = new QName("http://liberary.demo/", "issueBookDetailResponse");
    private final static QName _AddBook_QNAME = new QName("http://liberary.demo/", "addBook");
    private final static QName _HelloResponse_QNAME = new QName("http://liberary.demo/", "helloResponse");
    private final static QName _UpdateBookResponse_QNAME = new QName("http://liberary.demo/", "updateBookResponse");
    private final static QName _IssuedByBookIdResponse_QNAME = new QName("http://liberary.demo/", "issuedByBookIdResponse");
    private final static QName _BookDetailByStream_QNAME = new QName("http://liberary.demo/", "bookDetailByStream");
    private final static QName _IssueBookDetail_QNAME = new QName("http://liberary.demo/", "issueBookDetail");
    private final static QName _Hello_QNAME = new QName("http://liberary.demo/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myliberary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteIssue }
     * 
     */
    public DeleteIssue createDeleteIssue() {
        return new DeleteIssue();
    }

    /**
     * Create an instance of {@link IssuedByStudentIdResponse }
     * 
     */
    public IssuedByStudentIdResponse createIssuedByStudentIdResponse() {
        return new IssuedByStudentIdResponse();
    }

    /**
     * Create an instance of {@link InsertReturnDetailResponse }
     * 
     */
    public InsertReturnDetailResponse createInsertReturnDetailResponse() {
        return new InsertReturnDetailResponse();
    }

    /**
     * Create an instance of {@link InsertReturnDetail }
     * 
     */
    public InsertReturnDetail createInsertReturnDetail() {
        return new InsertReturnDetail();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link DeleteIssueResponse }
     * 
     */
    public DeleteIssueResponse createDeleteIssueResponse() {
        return new DeleteIssueResponse();
    }

    /**
     * Create an instance of {@link IssuedByStudentId }
     * 
     */
    public IssuedByStudentId createIssuedByStudentId() {
        return new IssuedByStudentId();
    }

    /**
     * Create an instance of {@link StudentRegisterResponse }
     * 
     */
    public StudentRegisterResponse createStudentRegisterResponse() {
        return new StudentRegisterResponse();
    }

    /**
     * Create an instance of {@link BookDetailByNameResponse }
     * 
     */
    public BookDetailByNameResponse createBookDetailByNameResponse() {
        return new BookDetailByNameResponse();
    }

    /**
     * Create an instance of {@link IssuedByBookId }
     * 
     */
    public IssuedByBookId createIssuedByBookId() {
        return new IssuedByBookId();
    }

    /**
     * Create an instance of {@link BookDetailByName }
     * 
     */
    public BookDetailByName createBookDetailByName() {
        return new BookDetailByName();
    }

    /**
     * Create an instance of {@link BookDetailByStreamResponse }
     * 
     */
    public BookDetailByStreamResponse createBookDetailByStreamResponse() {
        return new BookDetailByStreamResponse();
    }

    /**
     * Create an instance of {@link StudentReturn }
     * 
     */
    public StudentReturn createStudentReturn() {
        return new StudentReturn();
    }

    /**
     * Create an instance of {@link StudentReturnResponse }
     * 
     */
    public StudentReturnResponse createStudentReturnResponse() {
        return new StudentReturnResponse();
    }

    /**
     * Create an instance of {@link InsertIssueBook }
     * 
     */
    public InsertIssueBook createInsertIssueBook() {
        return new InsertIssueBook();
    }

    /**
     * Create an instance of {@link InsertIssueBookResponse }
     * 
     */
    public InsertIssueBookResponse createInsertIssueBookResponse() {
        return new InsertIssueBookResponse();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link StudentRegister }
     * 
     */
    public StudentRegister createStudentRegister() {
        return new StudentRegister();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link IssueBookDetailResponse }
     * 
     */
    public IssueBookDetailResponse createIssueBookDetailResponse() {
        return new IssueBookDetailResponse();
    }

    /**
     * Create an instance of {@link IssuedByBookIdResponse }
     * 
     */
    public IssuedByBookIdResponse createIssuedByBookIdResponse() {
        return new IssuedByBookIdResponse();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link IssueBookDetail }
     * 
     */
    public IssueBookDetail createIssueBookDetail() {
        return new IssueBookDetail();
    }

    /**
     * Create an instance of {@link BookDetailByStream }
     * 
     */
    public BookDetailByStream createBookDetailByStream() {
        return new BookDetailByStream();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "updateBook")
    public JAXBElement<UpdateBook> createUpdateBook(UpdateBook value) {
        return new JAXBElement<UpdateBook>(_UpdateBook_QNAME, UpdateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReturnDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "insertReturnDetail")
    public JAXBElement<InsertReturnDetail> createInsertReturnDetail(InsertReturnDetail value) {
        return new JAXBElement<InsertReturnDetail>(_InsertReturnDetail_QNAME, InsertReturnDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertReturnDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "insertReturnDetailResponse")
    public JAXBElement<InsertReturnDetailResponse> createInsertReturnDetailResponse(InsertReturnDetailResponse value) {
        return new JAXBElement<InsertReturnDetailResponse>(_InsertReturnDetailResponse_QNAME, InsertReturnDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuedByStudentIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "issuedByStudentIdResponse")
    public JAXBElement<IssuedByStudentIdResponse> createIssuedByStudentIdResponse(IssuedByStudentIdResponse value) {
        return new JAXBElement<IssuedByStudentIdResponse>(_IssuedByStudentIdResponse_QNAME, IssuedByStudentIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIssue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "deleteIssue")
    public JAXBElement<DeleteIssue> createDeleteIssue(DeleteIssue value) {
        return new JAXBElement<DeleteIssue>(_DeleteIssue_QNAME, DeleteIssue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookDetailByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "bookDetailByName")
    public JAXBElement<BookDetailByName> createBookDetailByName(BookDetailByName value) {
        return new JAXBElement<BookDetailByName>(_BookDetailByName_QNAME, BookDetailByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuedByBookId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "issuedByBookId")
    public JAXBElement<IssuedByBookId> createIssuedByBookId(IssuedByBookId value) {
        return new JAXBElement<IssuedByBookId>(_IssuedByBookId_QNAME, IssuedByBookId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookDetailByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "bookDetailByNameResponse")
    public JAXBElement<BookDetailByNameResponse> createBookDetailByNameResponse(BookDetailByNameResponse value) {
        return new JAXBElement<BookDetailByNameResponse>(_BookDetailByNameResponse_QNAME, BookDetailByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIssueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "deleteIssueResponse")
    public JAXBElement<DeleteIssueResponse> createDeleteIssueResponse(DeleteIssueResponse value) {
        return new JAXBElement<DeleteIssueResponse>(_DeleteIssueResponse_QNAME, DeleteIssueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuedByStudentId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "issuedByStudentId")
    public JAXBElement<IssuedByStudentId> createIssuedByStudentId(IssuedByStudentId value) {
        return new JAXBElement<IssuedByStudentId>(_IssuedByStudentId_QNAME, IssuedByStudentId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentRegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "studentRegisterResponse")
    public JAXBElement<StudentRegisterResponse> createStudentRegisterResponse(StudentRegisterResponse value) {
        return new JAXBElement<StudentRegisterResponse>(_StudentRegisterResponse_QNAME, StudentRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookDetailByStreamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "bookDetailByStreamResponse")
    public JAXBElement<BookDetailByStreamResponse> createBookDetailByStreamResponse(BookDetailByStreamResponse value) {
        return new JAXBElement<BookDetailByStreamResponse>(_BookDetailByStreamResponse_QNAME, BookDetailByStreamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentReturnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "studentReturnResponse")
    public JAXBElement<StudentReturnResponse> createStudentReturnResponse(StudentReturnResponse value) {
        return new JAXBElement<StudentReturnResponse>(_StudentReturnResponse_QNAME, StudentReturnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "studentReturn")
    public JAXBElement<StudentReturn> createStudentReturn(StudentReturn value) {
        return new JAXBElement<StudentReturn>(_StudentReturn_QNAME, StudentReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentRegister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "studentRegister")
    public JAXBElement<StudentRegister> createStudentRegister(StudentRegister value) {
        return new JAXBElement<StudentRegister>(_StudentRegister_QNAME, StudentRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertIssueBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "insertIssueBookResponse")
    public JAXBElement<InsertIssueBookResponse> createInsertIssueBookResponse(InsertIssueBookResponse value) {
        return new JAXBElement<InsertIssueBookResponse>(_InsertIssueBookResponse_QNAME, InsertIssueBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertIssueBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "insertIssueBook")
    public JAXBElement<InsertIssueBook> createInsertIssueBook(InsertIssueBook value) {
        return new JAXBElement<InsertIssueBook>(_InsertIssueBook_QNAME, InsertIssueBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueBookDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "issueBookDetailResponse")
    public JAXBElement<IssueBookDetailResponse> createIssueBookDetailResponse(IssueBookDetailResponse value) {
        return new JAXBElement<IssueBookDetailResponse>(_IssueBookDetailResponse_QNAME, IssueBookDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "updateBookResponse")
    public JAXBElement<UpdateBookResponse> createUpdateBookResponse(UpdateBookResponse value) {
        return new JAXBElement<UpdateBookResponse>(_UpdateBookResponse_QNAME, UpdateBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuedByBookIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "issuedByBookIdResponse")
    public JAXBElement<IssuedByBookIdResponse> createIssuedByBookIdResponse(IssuedByBookIdResponse value) {
        return new JAXBElement<IssuedByBookIdResponse>(_IssuedByBookIdResponse_QNAME, IssuedByBookIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookDetailByStream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "bookDetailByStream")
    public JAXBElement<BookDetailByStream> createBookDetailByStream(BookDetailByStream value) {
        return new JAXBElement<BookDetailByStream>(_BookDetailByStream_QNAME, BookDetailByStream.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueBookDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "issueBookDetail")
    public JAXBElement<IssueBookDetail> createIssueBookDetail(IssueBookDetail value) {
        return new JAXBElement<IssueBookDetail>(_IssueBookDetail_QNAME, IssueBookDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://liberary.demo/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
