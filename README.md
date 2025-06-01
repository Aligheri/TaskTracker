

  <h1>📝 TaskTracker</h1>

  <div class="section">
    <p>
      <strong>TaskTracker</strong> is a simple and clean Java web application that allows users to manage their personal or work-related tasks. 
      It supports <strong>adding</strong>, <strong>editing</strong>, and <strong>deleting</strong> tasks via a basic web interface.
    </p>
    <p>
      The application uses <strong>Java Servlets</strong>, <strong>JSP</strong>, and is built with <strong>Maven</strong>. 
      It's ideal for educational purposes or as a base for a more complex task management system.
    </p>
  </div>

  <div class="section">
    <h2>📁 Project Structure</h2>
    <pre><code>TaskTracker/
├── pom.xml                  # Maven project configuration
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/tasktracker/
│       │       ├── Task.java
│       │       ├── TaskServlet.java
│       │       └── TaskDAO.java
│       └── webapp/
│           ├── index.jsp
│           └── WEB-INF/
│               └── web.xml
    </code></pre>
  </div>

  <div class="section">
    <h2>🚀 Getting Started</h2>
    <h3>📌 Prerequisites</h3>
    <ul>
      <li>Java JDK 8 or later</li>
      <li>Apache Maven</li>
      <li>Servlet container (e.g., Tomcat 9+)</li>
    </ul>

    <h3>📥 Installation</h3>
    <pre><code>git clone https://github.com/Aligheri/TaskTracker.git
cd TaskTracker
mvn clean package</code></pre>
  </div>

  <div class="section">
    <h2>📦 Deployment</h2>
    <p>Deploy the generated <code>.war</code> file found in the <code>target/</code> directory to your Tomcat <code>webapps/</code> folder:</p>
    <pre><code>cp target/TaskTracker.war /path/to/tomcat/webapps/</code></pre>
    <p>Then start Tomcat and navigate to:</p>
    <pre><code>http://localhost:8080/TaskTracker/</code></pre>
  </div>

  <div class="section">
    <h2>🧪 Features</h2>
    <ul>
      <li>📋 View current task list</li>
      <li>➕ Add new tasks</li>
      <li>✏️ Edit existing tasks</li>
      <li>🗑️ Delete tasks</li>
      <li>💾 Persistent storage via DAO (in-memory or simple database)</li>
    </ul>
  </div>


  <div class="section">
    <h2>🔗 Resources</h2>
    <ul>
      <li><a href="https://github.com/Aligheri/TaskTracker">GitHub Repository</a></li>
      <li><a href="https://maven.apache.org/" target="_blank">Maven Documentation</a></li>
      <li><a href="https://tomcat.apache.org/" target="_blank">Tomcat</a></li>
      <li><a href="https://docs.oracle.com/javaee/" target="_blank">Java EE / Servlet Documentation</a></li>
    </ul>
  </div>

</body>
</html>

