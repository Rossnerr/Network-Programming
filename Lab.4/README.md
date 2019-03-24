# Laboratory Work Nr. 4

### Objectives 
 - Understand the basic concepts of the email systems;
 - Study the SMTP and POP3 protocols.
 
### Task
 * Create a simple email client application which will give the possibility to send and read messages using an email account. The next list
 contains the optional tasks:
   - Send an email with some attachments;
   - Send an html email which will includes pictures;
   - Develop a class _POP3Header_ which will be reasponsible for reading the headers of a message.

### Theory
The email systems can be described as asynchronous and indirect. Here, the messages are sent to an intermediate which ensures the transfer,
but the writing and reading are independent processes.

Next I will try to explain the phases through which a message goes while it is sent to another user:
 1. The user writes a message using an email client(MUA, Mail User Agent) which will ensure the message creation and rendering to a
 message transfer agent(MTA, Mail Transfer Agent). In order to transmit it the SMTP protocol is used.
 2. The MTA will try to determine the recipient's address which represents the address of a server that is reasponsible for receiving and
 redistributing messages(MX, Mail eXchanger). It can be easily viewed in the recipient's domain after the @ symbol. The conversion will
 from a domain name to an IP address will be done by the DNS server.
 3. The MTA server will send the message to the recipient server using the SMTP protocol. The recipient server will redirect it to the
 recipient's inbox.
 4. The recipient user using the POP3 protocol will read the message.
 
SMTP(Simple Mail Transfer Protocol) is an Internet standard for electronic mail(e-mail) transmission across Internet Protocol(IP) networks.
SMTP uses TCP port 25. SMTP connections secured by SSL are known by the shorthand SMTPS, though SMTPS is not a protocol in its own right.
As this protocol started out purely ASCII text-based, it did not deal well with binary files, or characters in many non-English languages.
Because of that standards such as Multipurpose Internet Mail Extensions(MIME) were developed to encode binary files for transfer through
SMTP.

MIME extends the format of email to support:
  - Text in character sets other than ASCII;
  - Non-text attachments: audio, video, images, application programs etc;
  - Message bodies with multiple parts;
  - Header information in non-ASCII character sets.
  
 
