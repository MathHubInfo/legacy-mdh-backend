# MDH Backend
Website backend code that
- that does not get generated in the MBGen process and 
- templates for the files that get generated.

## Development

To reset the status, run the following in `src`:
```
git clean -df
git checkout .
```
The first resets the files `JsonSupport.scala` and `db/ZooDb.scala`, while the second removes table-specific packages.
