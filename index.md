## cim-compare Release Log

### Release 1.0.0 [17-Apr-2020]
Initial release of the **cim-compare** project.  This release supports:

- Command line input of Enterprise Architect CompareLog (XML) files.
- Command line input of  **UML 1.3 (XMI 1.1)** format of Enterprise Architect exports of the CIM.  This allows an end-user to bypass having to use Enterprise Architect to first generate and export a model comparison log. It also aligns this release with the XMI version supported by EA's Compare Utility.
- Generation of standalone HTML comparison reports viewable in most standard browsers (e.g. Chrome, Firefox, Edge, etc.)
- Given the size of comparison reports the initial release includes the ability to auto-locate and expand on a specific CIM class via a search by class name.
- Model changes represented using color-oriented visualization within reports.

### Release 1.0.1 [31-Jan-2021]
Minor release of the **cim-compare** project.  This release supports:

- Better command line XMI export version validation and end-user error output. **cim-compare** will now provide more detail on what specifically was invalid for a baseline or target XMI input file that was not exported by an Enterprise Architect exporter currently support by **cim-compare**. For example the "Unisys/Rose Format" option must not be checked for an XMI export within Enterprise Architect. This is detected and reported to the end-user with graceful termination of execution.
- Fixed numerous defects reported around the Links section of the comparison reports.
- Additional improvements to the HTML output generated so that changes are more clearly communicated.