rootProject.name = "typeracer-kotlin"
include("Main")
include("src:main:untitled")
findProject(":src:main:untitled")?.name = "untitled"
