package intermediate.icodeimpl;

import intermediate.ICodeFactory;
import intermediate.ICodeKey;
import intermediate.ICodeNode;
import intermediate.ICodeNodeType;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ICodeNodeImpl
 *
 * An implementation of a node of the intermediate code.
 */
public class ICodeNodeImpl extends HashMap<ICodeKey, Object> implements ICodeNode{
    private ICodeNodeType type; // node type
    private ICodeNode parent; // parent node
    private ArrayList<ICodeNode> children; // children array list

    /**
     * Constructor
     * @param type the node type.
     */
    public ICodeNodeImpl(ICodeNodeType type) {
        this.type = type;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    /**
     * Getter
     * @return the node type
     */
    @Override
    public ICodeNodeType getType() {
        return type;
    }

    /**
     * Return the parent of the node.
     * @return the parent node.
     */
    @Override
    public ICodeNode getParent() {
        return parent;
    }

    /**
     * Add a child node.
     * @param node the child node.
     * @return the child node.
     */
    @Override
    public ICodeNode addChild(ICodeNode node) {
        children.add(node);
        return node;
    }

    /**
     * Return an array list of this node's children.
     * @return the array list of children
     */
    @Override
    public ArrayList<ICodeNode> getChildren() {
        return children;
    }

    /**
     * Set a node attribute.
     * @param key the attribute key.
     * @param value the attribute value.
     */
    @Override
    public void setAttribute(ICodeKey key, Object value) {
        put(key, value);
    }

    /**
     * Get the value of a node attribute.
     * @param key the attribute key.
     * @return the attribute value.
     */
    @Override
    public Object getAttribute(ICodeKey key) {
        return get(key);
    }

    /**
     * Make a copy of this node.
     * @return the copy.
     */
    @Override
    public ICodeNode copy() {
        ICodeNode copy = ICodeFactory.createICodeNode(type);

        for (ICodeKey key : this.keySet()) {
            copy.setAttribute(key, get(key));
        }

        return copy;
    }
}
