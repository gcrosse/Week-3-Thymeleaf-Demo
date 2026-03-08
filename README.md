<<<<<<< HEAD
# Lab 1 - Thymeleaf Demo
=======
# Lab 2 - Thymeleaf - Post Mapping Demo
>>>>>>> upstream/main

## Course Information
- **Course:** CPAN 228
- **Topic:** Implementing Controllers & Thymeleaf Templates

## Getting Started

This is a starter template for your lab assignments. Follow the GitHub setup below before beginning your work.

### GitHub Setup

1. **Fork the Repository**
   - Go to the repository on GitHub
   - Click the "Fork" button in the top-right corner
   - This creates your own copy of the project

2. **Clone Your Fork**
   ```bash
   git clone https://github.com/YOUR-USERNAME/Thymeleaf-Demo.git
   cd Thymeleaf-Demo
   ```

3. **Add Upstream Remote**
   ```bash
   git remote add upstream https://github.com/ORIGINAL-REPO.git
   ```

4. **Pull Latest Changes**
   ```bash
   git pull upstream main
   ```

5. **Create a Feature Branch**
   ```bash
   git checkout -b feature/lab-yourname
   ```
   Replace `yourname` with your actual name (e.g., `feature/lab1-john-doe`)

---

<<<<<<< HEAD
## Lab 1 Assignment

### About Controller Implementation

Implement a new `AboutController` with the following requirements:

#### Endpoint Requirements
- **Path:** `localhost:8080/about`
- **HTTP Method:** GET
- **Return:** HTML template displaying content about the "Tekken Reborn" game

#### Template Requirements
- **Heading:** Display an `<h1>` tag with the text `Tekken Reborn`
- **Description:** Add a description of Tekken Reborn or the game's features
  - Be creative! Use any HTML elements you like (paragraphs, divs, lists, images, etc.)
  - Make it visually appealing using the existing `styles.css`
  - Include at least 2-3 sentences of meaningful content

#### Example Output
```html
<h1>Tekken Reborn</h1>
<p>An epic fighting game where legendary warriors clash...</p>
<!-- Add more creative content here -->
```
=======
## Lab 2 Assignment

### CreateFighterController Implementation with Form Validation

Implement a `CreateFighterController` with POST method to process fighter registration and add it to the fighter pool (list of fighters similar to what we did in class with players).

#### Requirements

##### Controller Implementation
- **Implement `createFighter()` method** with POST signature
  - Handle form submissions from the fighter registration form
  - Add submitted fighters to the fighter pool (list)
  - Redirect on successful submission

##### Validation Requirements
- **All fields required:** name, health, damage, resistance
- **Health validation:** Must be more than 1000 but less than 1500
- **Damage validation:** Must be less than 100
- **Resistance validation:** Must be from 0 to 10 and must be a double value

##### Form & Display
- **CreateFighter Template:** 
  - Create a registration form that guides users to fix validation issues
  - Display validation error messages on the form
 
- **FighterController:**
  - Create a new `FighterController` that renders fighters in a table
  - Display all registered fighters similar to what we did with Players
  - Table should show: name, health, damage, resistance

##### Testing
- Ensure validation is properly working on form submission
- Test all validation scenarios
- Verify fighters are added to the list successfully
>>>>>>> upstream/main

---


## Development Workflow

1. Create your feature branch with your name
2. Make changes for the lab assignment
3. Test locally: `mvn spring-boot:run`
4. Commit your changes:
   ```bash
   git add .
<<<<<<< HEAD
   git commit -m "Lab 1: Implement About Controller"
=======
   git commit -m "Lab 2: Implement CreateFighterController with Validation"
>>>>>>> upstream/main
   ```
5. Push to your fork:
   ```bash
   git push origin feature/lab-yourname
   ```
<<<<<<< HEAD
6. Create a pull request 
=======
6. Create a pull request and submit the link on BlackBoard
>>>>>>> upstream/main

---

## Resources

- [Thymeleaf Cheat Sheet](THYMELEAF_CHEATSHEET.md) - Common Thymeleaf syntax and patterns
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Thymeleaf Official Docs](https://www.thymeleaf.org/)
  <div th:if="${#fields.hasErrors('name')}" class="invalid-feedback">
    <span th:errors="*{name}">Name error</span>
  </div>
</div>
```

---

## Reference Quick Table

| Attribute | Purpose |
|-----------|---------|
| `th:text` | Display variable (escaped HTML) |
| `th:utext` | Display variable (raw HTML) |
| `th:href` | Generate URLs |
| `th:src` | Bind image/resource URLs |
| `th:value` | Bind form input values |
| `th:each` | Loop through collections |
| `th:if` | Conditional rendering (true) |
| `th:unless` | Conditional rendering (false) |
| `th:switch/case` | Multiple conditions |
| `th:object` | Bind form to model object |
| `th:field` | Bind form input to model field |
| `th:errors` | Display field validation errors |
| `th:class` | Conditional CSS classes |
| `th:style` | Conditional inline styles |
| `th:with` | Define local variables |
| `th:insert` | Include fragment as child |
| `th:replace` | Replace element with fragment |
| `@{}` | URL expression |
| `${}` | Variable expression |
| `*{}` | Object variable expression |
| `#{}` | Utility object expression |

---


