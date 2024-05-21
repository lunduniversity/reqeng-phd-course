//> using scala "3.4.1"

//  run this command in terminal to create slides in target/out.pdf 
//  scala-cli run .

import taggy.*

@main def run = slides.toPdf()

def slides = document("Next Gen RE Teaching for Next Gen Devs"):
  frame("Hypotheses on Next Gen Devs"):
    itemize:
      p("Cross-functional DevOps Teams \\& Decentralization => \\\\More of the actual RE work is done by the coders")
      p("Agile \\& Open Source => \\\\Requirements in flat-structured NL markdown issues")
      p("LLM Coding Support \\& Low Code / No Code =>\\\\Prompts == NL Requirements\\\\Increased importance of RE by Coders")

  frame("Implications for RE Teaching"):
    p("Focus more on...")
    itemize:
      p("Practical **RE for coders** -- learning by doing:\\\\connecting the ''hard'' engineering work with the ''soft''' parts of RE: elicitation, communication, decision-making, ...")
      p("Providing a consistent and **relevant vocabulary** for NL requirements modelling with structure and regularity.")
      p("RE tooling that integrate with **git** and **markdown** issues")

  frame("Future ideas on reqT for teaching RE:"):
    itemize:
      p("Focus on vocabulary and structured NL")
      p("Markdown <=> embedded DSL")
      p("New metamodel utilizing new features of Scala 3")
      p("Decision-making (prioritization, release planning) based on constraint solving")
  frame("Current stable and milestone versions of reqT"):
    itemize:
      p("Stable version used for MSc course ETSN15 labs 2024:")
      itemize:
        p("https://github.com/reqT/reqT/releases/tag/v3.1.7")
      p("Latest milestone version of reqT v4:")
      itemize:
        p("https://github.com/reqT/reqT/releases")  
  
  frame("New reqT metamodel:"):
    image(file = "../metamodel1.pdf", width = 0.75) 

  frame("New reqT metamodel:"):
    p("~\\vspace{-1cm}")
    image(file = "../metamodel2.pdf", width = 0.75) 

  frame(""):
    p("~\\vspace{-1cm}")
    image(file = "../metamodel4.pdf", width = 1.12) 

  frame("reqT Tree Editor GUI"):
    itemize:
      p("Green area: Tree Navigator")
      p("Gray area: Text Editor (Markdown indentation lists)")
      p("Pink area: Log with output, analysis, metrics etc")
    p("~\\vspace{-0.5cm}")
    image(file = "../gui.png", width = 1.0) 

  frame("How to install:"):
    itemize:
      p("Download reqT jar-file from here:\\\\https://github.com/reqT/reqT/releases \\\\ run with `java -jar reqT.jar`")
      p("To run the jar you only need java:")
      itemize:
        p("java on mac/ubuntu: https://sdkman.io/")
        p("java on windows: https://adoptium.net/ ")
      p("To generate graphs of reqT models you need graphviz:")
      itemize:
        p("https://graphviz.org/download/")
      p("On windows this is the recommended new terminal:")
      itemize:
        p("https://learn.microsoft.com/en-us/windows/terminal/install")
      p("To run the latest reqT v4 in a shell you need scala-cli:")
      itemize:
        p("https://scala-cli.virtuslab.org/install")
        p("run with `scala-cli repl --jar reqT.jar -S 3.3`")

  frame("Further reading on reqT"):
    textSize(7.5,10.5)
    itemize:
      p("""Regnell, Björn. **''Towards a semi-formal, open and scalable requirements modeling tool''**. Requirements Engineering: Foundation for Software Quality: 19th International Working Conference, REFSQ 2013, Essen, Germany, April 8-11, 2013. Proceedings 19. Springer Berlin Heidelberg, 2013.""")
      p("""Regnell, Björn. **''What is essential? -- A pilot survey on views about the requirements metamodel of reqT''**. Requirements Engineering: Foundation for Software Quality: 22nd International Working Conference, REFSQ 2016, Gothenburg, Sweden, March 14-17, 2016, Proceedings 22. Springer International Publishing, 2016.""")
      p("""Regnell, Björn, and Krzysztof Kuchcinski. **''A scala embedded DSL for combinatorial optimization in software requirements engineering''**. First Workshop on Domain Specific Languages in Combinatorial Optimization. 2013.""")
      p("""Regnell, Björn, and Krzysztof Kuchcinski. **''Exploring software product management decision problems with constraint solving-opportunities for prioritization and release planning''**. 2011 Fifth International Workshop on Software Product Management (IWSPM). IEEE, 2011.""")
      p("On-going work on the 4.x branch:  https://github.com/reqT/reqT/tree/4.x")
      p("Download concept definitions:  https://github.com/reqT/reqT-lang/releases/download/v4.2.0/concepts-GENERATED.csv")


  