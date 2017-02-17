# Microlibrary: TreeNodePrinter

TreeNodePrinter utility.
It draws a cute tree like

```
Grandma
├─┬ Dad
| ├── Sister
| └─┬ Me
|   ├── Daughter
|   └── Son
└── Aunt
```

It operates on your tree node type, as long as you can pass in functions for getting the children from a node and for printing a node.

Add this to your Scala project:

`rug edit jessitron:microlib-TreeNodePrinter:BringIn package=com.wherever.you.want.it`

(you'll need to [install the Rug CLI](http://docs.atomist.com/rug/rug-cli/rug-cli-install/) to run that)