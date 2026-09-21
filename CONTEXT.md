# Head First Java — working context

## Current phase

Working through **Head First Java, 3rd Edition**.

- Book targets Java 11, recommends **Java 17**. Use **Temurin/Adoptium JDK 17**.
- Do **not** treat this as a Spring/Maven/IntelliJ project yet.

## Editor rules (until the book is done)

- **VS Code as a text editor**, not an IDE.
- Install **only**: Language Support for Java by Red Hat (`redhat.java`).
- **Do not** install Extension Pack for Java (debugger, Maven, Test Runner, Project Manager).
- Syntax coloring is wanted. Autocomplete / IntelliSense is **not**.
- Prettier may stay on for JS/JSON/Markdown. Prettier **does not format Java**. Leave Java format-on-save off unless asked.
- Filename is `ClassName.java` (not `.Java`).
- Compile and run **only** in the terminal. No green Run button, no project manager, no debugger.

```bash
javac ClassName.java
java ClassName
```

`javac` compiles `.java` → `.class` (bytecode). `java` starts the JVM and runs that bytecode.

Suggested VS Code settings if suggestions appear:

```json
{
  "java.completion.enabled": false,
  "java.signatureHelp.enabled": false,
  "java.server.launchMode": "LightWeight",
  "[java]": {
    "editor.quickSuggestions": { "other": false, "comments": false, "strings": false },
    "editor.suggestOnTriggerCharacters": false,
    "editor.wordBasedSuggestions": "off",
    "editor.parameterHints.enabled": false
  }
}
```

## How to work through the book

- Write **in the book** (Sharpen Your Pencil, puzzles, fill-ins). Notebook only for keepers: syntax that keeps getting forgotten, `javac`/`java` notes, package/classpath, chapter recaps, errors and fixes.
- Do the exercises. Don’t rewrite the book. Don’t highlight everything.
- Java is **not** JavaScript. Same C-family costume (braces, `if`/`for`, `class`). Different language: static types, JVM, real classes, `null` with no `undefined`, threads not an event loop. Don’t translate “this is just JS with types.”

## After the book (do not start this now)

**Not next:** [Chris Blakely patient-management microservices](https://github.com/chrisblakely01/java-spring-microservices) / [YouTube](https://www.youtube.com/watch?v=tseqdcFfTUY).

That course assumes HTTP + layered Spring + DB + a build tool. Pre-learn **none** of: gRPC, Kafka, Gateway, AWS.

**Intermediary (after Head First):** one Spring Boot **monolith** you build:

- Maven (`pom.xml`, `mvn spring-boot:run`)
- Controller → Service → Repository
- REST CRUD + DTOs (don’t expose entities)
- Validation + `@ControllerAdvice`
- Spring Data JPA + PostgreSQL (not only H2)
- Dockerfile + docker compose (app + Postgres)
- Hit it with curl/Postman

Then that video. If Controller / Repository / `application.yml` still aren’t explainable, don’t start the 12-hour course.

Gaps Head First doesn’t cover (study then, not now): Maven, HTTP/JSON, SQL CRUD, “JDBC exists / JPA hides it”, annotations + DI.

**Spring vs Spring Boot:** Spring is the framework (DI + modules). Boot is Spring with defaults filled in (starters, auto-config, embedded server, `application.yml`). Not needed for this book.

**IDE later:** IntelliJ is the best Spring IDE; Ultimate is optional and has no pay-once-forever-current license. Free IntelliJ or VS Code + Extension Pack is enough for the first Spring app. Don’t buy Ultimate before Head First + one CRUD app are done.

## Agent behavior in this repo

- Help with chapter exercises, `javac`/`java`, packages/classpath, and first-principles Java.
- Do **not** scaffold Maven/Gradle/Spring, add IDE run configs, or “just click Run.”
- Do **not** dump autocomplete-style solutions that hide why it compiles.
- Keep explanations short and literal.
