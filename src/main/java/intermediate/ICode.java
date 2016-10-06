package intermediate;

/**
 * ICode
 *
 * The interface that represents the intermediate code.
 */
public interface ICode {
    /**
     * Set and return the root node.
     * @param node the node to be set as root.
     * @return the root node.
     */
    public ICodeNode setRoot(ICodeNode node);

    /**
     * Get the root node.
     * @return the root node
     */
    public ICodeNode getRoot();
}
