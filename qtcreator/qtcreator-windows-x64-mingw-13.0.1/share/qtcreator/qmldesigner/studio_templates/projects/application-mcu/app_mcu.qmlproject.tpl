/* File generated by Qt Design Studio */

import QmlProject 1.3

Project {
    mainFile: "%{MainQmlFileName}"
    QDS.mainUiFile: "Screen01.ui.qml"

    /* Include .qml, .js, and image files from current directory and subdirectories */
    QmlFiles {
        directory: "."
    }

    JavaScriptFiles {
        directory: "."
    }

    ImageFiles {
        directory: "."
    }

    Files {
       filter: "*.conf"
       files: ["qtquickcontrols2.conf"]
    }

    Files {
        filter: "qmldir"
        directory: "."
    }

    Files {
        filter: "*.ttf;*.otf"
    }

    ModuleFiles {
        files: [
            "imports/Constants/constants_module.qmlproject"
        ]

        MCU.qulModules: [
            "Controls",
            "ControlsTemplates",
            "Timeline",
            "Shapes"
        ]
    }


    /* Following entries are for Qt Design Studio compatibility: */
    QDS.Environment {
        QT_QUICK_CONTROLS_CONF: "qtquickcontrols2.conf"
    }

    QDS.qtForMCUs: true
    QDS.qt6Project: true

    QDS.qdsVersion: "4.3"
    QDS.quickVersion: "6.5"

    /* List of plugin directories passed to QML runtime */
    importPaths: [ "imports" ]

    QDS.targetDirectory: "/opt/%{ProjectName}"
}