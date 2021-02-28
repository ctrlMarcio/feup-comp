package w1_JavaCCTutorial.e31;

import w1_JavaCCTutorial.e31.Node;

/* Generated By:JJTree: Do not edit this line. SimpleNode.java Version 4.1 */
/* JavaCCOptions:MULTI=false,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class SimpleNode implements Node {
    // edited code
    public int val;
    public String image;
    // end of edited code

    protected Node parent;
    protected Node[] children;
    protected int id;
    protected Object value;
    protected Calculator parser;

    public SimpleNode(int i) {
        id = i;
    }

    public SimpleNode(Calculator p, int i) {
        this(i);
        parser = p;
    }

    public void jjtOpen() {
    }

    public void jjtClose() {
    }

    public void jjtSetParent(Node n) {
        parent = n;
    }

    public Node jjtGetParent() {
        return parent;
    }

    public void jjtAddChild(Node n, int i) {
        if (children == null) {
            children = new Node[i + 1];
        } else if (i >= children.length) {
            Node[] c = new Node[i + 1];
            System.arraycopy(children, 0, c, 0, children.length);
            children = c;
        }
        children[i] = n;
    }

    public Node jjtGetChild(int i) {
        return children[i];
    }

    public int jjtGetNumChildren() {
        return (children == null) ? 0 : children.length;
    }

    public void jjtSetValue(Object value) {
        this.value = value;
    }

    public Object jjtGetValue() {
        return value;
    }

  /* You can override these two methods in subclasses of SimpleNode to
     customize the way the node appears when the tree is dumped.  If
     your output uses more than one line you should override
     toString(String), otherwise overriding toString() is probably all
     you need to do. */

    public String toString() {
        return CalculatorTreeConstants.jjtNodeName[id];
    }

    public String toString(String prefix) {
        return prefix + toString();
    }

  /* Override this method if you want to customize how the node dumps
     out its children. */

    public void dump(String prefix) {
        System.out.println(toString(prefix));

        // edited code
        switch (this.id) {
            case CalculatorTreeConstants.JJTADD:
                System.out.println("\t[ + ]");
                break;
            case CalculatorTreeConstants.JJTSUB:
                System.out.println("\t[ - ]");
                break;
            case CalculatorTreeConstants.JJTMUL:
                System.out.println("\t[ * ]");
                break;
            case CalculatorTreeConstants.JJTDIV:
                System.out.println("\t[ / ]");
                break;
            case CalculatorTreeConstants.JJTSYMBOL:
            case CalculatorTreeConstants.JJTINTEGER:
                System.out.println("\t[ " + this.image + " ]");
                break;
            case CalculatorTreeConstants.JJTTERM:
                System.out.println("\t[ " + this.val + " ]");
                break;
        }
        // end of edited code

        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                SimpleNode n = (SimpleNode) children[i];
                if (n != null) {
                    n.dump(prefix + " ");
                }
            }
        }
    }
}

/* JavaCC - OriginalChecksum=3425950ab4898190d93f5ebbe156051d (do not edit this line) */
