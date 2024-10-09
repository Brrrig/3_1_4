## RestCRUDFetch

Applications with role-based authorization and access rights

1. Implementation of saving to MySQL database
2. Client implementation in Bootstrap
3. Implementing REST controllers

# Task
1. WebSecurityConfig - security settings for specific URLs, as well as UserDetails and GrantedAuthority settings.
2. LoginSuccessHandler - a handler containing an algorithm of actions upon successful authentication. For example, here we can send a user with the admin role to the admin panel after logging in, and with the user role to the main page of the site, etc.
3. Create a Role class and associate User with roles so that a user can have several roles.
4. Implement the Role and User models with the GrantedAuthority and UserDetails interfaces, respectively. Change the security setting from inMemory to userDetailService.
5. All CRUD operations and pages for them should be available only to a user with the admin role at the url: /admin/.
6. A user with the user role should only have access to his home page /user, where his data is displayed. This page should only be accessible to users with the user and admin roles. Don't forget about multiple user roles!
7. Configure logout from any page using thymeleaf capabilities.
8. Configure LoginSuccessHandler so that the admin is redirected to the /admin page after authentication, and the user to his /user page.
9. Implement view using Bootstrap
10. Code Rest controllers for your application.
11. Recode the output (filling) of the table, modal windows, etc. in JS using the Fetch API, using JQuery is allowed.
12. The application page should not be reloaded when any data changes!
