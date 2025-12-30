package com.data

/**
 * Interface for things that can be shared to other users of the app.
 */
interface Shareable {
    /**
     * Function which is used to export data to a file.
     *
     * @param filename the name of the file, it is expected that this filename has the extension included at the end.
     */
    fun export(filename: String)

    /**
     * Function which is used to import data from a file to the implementers data type.
     *
     * @param filename the name of the file, it is expected that this filename has the extension included at the end.
     */
    fun import(filename: String)
}