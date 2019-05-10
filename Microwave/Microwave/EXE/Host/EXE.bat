echo off

set RHAP_JARS_DIR=C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist com\telelogic\microwave\evNoElectricity.class del com\telelogic\microwave\evNoElectricity.class
if exist com\telelogic\microwave\KeyReader.class del com\telelogic\microwave\KeyReader.class
if exist com\telelogic\microwave\evClose.class del com\telelogic\microwave\evClose.class
if exist com\telelogic\microwave\microwave_pkgClass.class del com\telelogic\microwave\microwave_pkgClass.class
if exist MainEXE.class del MainEXE.class
if exist com\telelogic\microwave\evElectricity.class del com\telelogic\microwave\evElectricity.class
if exist com\telelogic\microwave\ServicePerson.class del com\telelogic\microwave\ServicePerson.class
if exist com\telelogic\microwave\MicrowaveBuilder.class del com\telelogic\microwave\MicrowaveBuilder.class
if exist com\telelogic\microwave\evKeyPress.class del com\telelogic\microwave\evKeyPress.class
if exist com\telelogic\microwave\Teacher.class del com\telelogic\microwave\Teacher.class
if exist com\telelogic\microwave\Microwave.class del com\telelogic\microwave\Microwave.class
if exist com\telelogic\microwave\SchoolGuest.class del com\telelogic\microwave\SchoolGuest.class
if exist com\telelogic\microwave\Cleaner.class del com\telelogic\microwave\Cleaner.class
if exist com\telelogic\microwave\Student.class del com\telelogic\microwave\Student.class
if exist com\telelogic\microwave\evStartNormal.class del com\telelogic\microwave\evStartNormal.class
if exist com\telelogic\microwave\evStartGrill.class del com\telelogic\microwave\evStartGrill.class
if exist com\telelogic\microwave\evStartUnfrozing.class del com\telelogic\microwave\evStartUnfrozing.class
if exist com\telelogic\microwave\evStartWashing.class del com\telelogic\microwave\evStartWashing.class
if exist com\telelogic\microwave\Display.class del com\telelogic\microwave\Display.class
if exist com\telelogic\microwave\evOpen.class del com\telelogic\microwave\evOpen.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


