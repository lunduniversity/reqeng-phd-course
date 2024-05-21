# Seminar 4: Special Domains and Contexts

Selected domains and contexts: Agile RE, Open-Source RE, Regulatory Requirements, High-Assurance Systems**

## Preparations

* Prepare discussion items on these papers:
  * AGRE: Cao, Lan, and Balasubramaniam Ramesh. "Agile requirements engineering practices: An empirical study." IEEE software 25.1, pp. 60-67, 2008. doi: 10.1109/MS.2008.1

  * OSSRE: Scacchi is the first paper on OSSRE (ever?) but probably a bit outdated. The Linåker paper focuses on strategies of organisations in relation to OSSRE.
    * Scacchi, Walt. "Understanding requirements for open source software." Design requirements engineering: A ten-year perspective. Springer, Berlin, Heidelberg, 2009. 467-494. 
    * [Linåker, Regnell. "What to share, when, and where: balancing the objectives and complexities of open source software contributions"](https://link.springer.com/content/pdf/10.1007/s10664-020-09855-2.pdf) 

* RE4AI: Each participant selects one paper that you want to read that no other participant reads and get ok on the paper from Bjorn via email. Starting-point for your search of an interesting paper:
[Sadovski, Aviv, Hadar. "Towards a Comprehensive Ontology for Requirements Engineering for AI-powered Systems" Refsq 2024.](https://coursegit.cs.lth.se/bjorn.regnell/reqeng-phd-course-project/-/tree/main/papers?ref_type=heads)
  * Prepare a 5-10 min summary of selected Papers on RE4AI:
    * **Rushali**: 
      * Deshpande, A., Sharp, H.: Responsible AI Systems: Who are the Stakeholders?. In Proceedings of the 2022 AAAI/ACM Conference on AI, Ethics, and Society, pp. 227-236 (2022).
    * **John**: 
      * Vogelsang, A., Borg, M.: Requirements engineering for machine learning: Perspectives from data scientists. In: Proceedings of the IEEE 27th International Requirements Engineering Conference Workshops (REW) (2019) 
    * **Matthias**: 
      * Tao, C., Gao, J., Wang, T.: Testing and quality validation for ai software –perspectives, issues, and practices. IEEE Access, vol. 7, pp. 120164 -120175 (2019).
    * **Konstantin**: 
      * Belani, H., Vukovic, M. and Car, Z. (2019) ‘Requirements Engineering Challenges in Building AI-Based Complex Systems’, 2019 IEEE 27th International Requirements Engineering Conference Workshops (REW), Requirements Engineering Conference Workshops (REW), 2019 IEEE 27th International.
    
    * Further optional reading, a recent systematic mapping study on RE4AI:
      * Ahmad, K., Abdelrazek, M., Arora, C., Bano, M., and Grundy, J.: Requirements engineering for artificial intelligence systems: A systematic mapping study. Information and Software Technology, vol. 158 (2023).

* *Regulatory requirements:* Taka a look at each of these two EU regulations, GDPR and AI Act, and for each of them: propose concrete examples of one **data** requirements, one **business logic** requirement and one **quality** requirements implied by these legislations. Choose a concrete hypothetical or real app or domain for which your proposed requirements are relevant. Document this here: ()

  * GDPR: 
    * https://commission.europa.eu/law/law-topic/data-protection/data-protection-eu_en 

  * AI Act: 
    * The final version that was voted on by the EU parliament March 2024:
https://www.europarl.europa.eu/doceo/document/TA-9-2024-0138_EN.pdf
    * Some relevant articles in the AI Act to focus on: 
      * High-risk AI requirements: Articles 9–15, 17, 72
      * Transparency obligations (mostly relevant for generative AI): Article 50
      * General purpose AI requirements (e.g. for ChatGPT): Articles 53, 55
    * All AI Act documents (a huge mass...): 
      * https://commission.europa.eu/strategy-and-policy/priorities-2019-2024/europe-fit-digital-age/excellence-and-trust-artificial-intelligence_en#documents


* SMIRK: Take a look here and try to formulate what is special with this domain from a requirements engineering perspective that you are interested in: https://github.com/RI-SE/smirk/tree/main/docs

## Agenda

Time plan: 13:15-17; leg stretcher around 14, 16; longer break around 15.

1. Discuss AGRE and OSSR, slides [here](https://github.com/lunduniversity/reqeng-phd-course/tree/main/2024)

2. Summarize and discuss your selected RE4AI-papers (see preparations): 
  * Run order: Rushali, John, Matthias, Konstantin. 
  * Bonus: Systematic mapping study by Ahmad et al.

3. Discussions on regulatory requirements: GDPR, AI Act.

4. Discussion on SMIRK and High-Assurance Systems.

5. Discussion on preparations for Seminar 5, see below.


## Preparations for Seminar 5

### Course Project

* Talk to your supervisor on course project 

* Present your course project plan:
  * goals
  * research questions
  * methodology
  * bonus: give a proposal for how reqT could be used to support your project


### RE Tools

* Preparations for labs on tooling for modeling, prioritization, release planning. Read these tooling papers on reqT before the seminar, available for download [here in dir reqT-papers](https://coursegit.cs.lth.se/bjorn.regnell/cs-project-course-reqeng/-/tree/main/papers/reqt-papers), in priority order: 

  1. Regnell, Björn. "reqT.org – towards a semi-formal, open and scalable requirements modeling tool." Requirements Engineering: Foundation for Software Quality: 19th International Working Conference, REFSQ 2013, Essen, Germany, April 8-11, 2013. Proceedings 19. Springer Berlin Heidelberg, 2013.
  2. Regnell, Björn. "What is essential?–A pilot survey on views about the requirements metamodel of reqT. org." Requirements Engineering: Foundation for Software Quality: 22nd International Working Conference, REFSQ 2016, Gothenburg, Sweden, March 14-17, 2016, Proceedings 22. Springer International Publishing, 2016.
  3. Regnell, Björn, and Krzysztof Kuchcinski. "A scala embedded DSL for combinatorial optimization in software requirements engineering." First Workshop on Domain Specific Languages in Combinatorial Optimization. 2013.
  4. Regnell, Björn, and Krzysztof Kuchcinski. "Exploring software product management decision problems with constraint solving-opportunities for prioritization and release planning." 2011 Fifth International Workshop on Software Product Management (IWSPM). IEEE, 2011.

* Matthias prepares a short summary on lessens learned from lab supervision of MSc students. What did the students do? What did the students learn? What to think about as a supervisor of the RE labs?

* Björn prepares intro to RE tools and the new version 4 of reqT with a new metamodel eDSL for Scala 3 and help you prepare for the labs post seminar.


## After last seminar 
* **After** seminar 5 at your own time planning:
  * do reqT labs: 
    * Matthias, Björn: helps on-demand in Zoom or at office with reqT 
    * Rushali, John, Konstantin: 
      * prepare a written feedback to Björn on the new lab instructions and reqT-v4; focus on learning outcome and usability

  * course project
    * email your course project plan to Björn and supervisors: 
    * talk to your supervisor on how to assess your project result
    * do your course project according to plan agreed with supervisor
