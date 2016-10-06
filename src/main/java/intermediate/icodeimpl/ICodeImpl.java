package intermediate.icodeimpl;

import intermediate.ICode;
import intermediate.ICodeNode;

/**
 * ICodeImpl
 *
 * An implementation of the intermediate code as a parse tree.
 */
public class ICodeImpl implements ICode{
    private ICodeNode root;

    /**
     * Set and return the root node.
     * @param node the node to be set as root.
     * @return the root node.
     */
    public ICodeNode setRoot(ICodeNode node) {
        root = node;
        return root;
    }

    /**
     * Get the root node.
     * @return the root node
     */
    @Override
    public ICodeNode getRoot() {
        return root;
    }
}
