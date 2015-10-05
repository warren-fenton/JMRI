// AddEntryExitPairAction.java
package jmri.jmrit.signalling;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import jmri.jmrit.display.layoutEditor.LayoutEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Swing action to create and register the Add Entry Exit Pair
 *
 * @author	Kevin Dickerson Copyright (C) 2011
 * @version	$Revision: 1.4 $
 */
public class AddEntryExitPairAction extends AbstractAction {

    /**
     *
     */
    private static final long serialVersionUID = -2153517492240562949L;

    public AddEntryExitPairAction(String s, LayoutEditor panel) {
        super(s);
        this.panel = panel;
    }
    LayoutEditor panel;

    public void actionPerformed(ActionEvent e) {
        AddEntryExitPairFrame f = new AddEntryExitPairFrame();
        try {
            f.initComponents(panel);
        } catch (Exception ex) {
            log.error("Exception: " + ex.toString());
            ex.printStackTrace();
        }
        f.setVisible(true);
    }
    static Logger log = LoggerFactory.getLogger(AddEntryExitPairAction.class.getName());
}


/* @(#)AddEntryExitPairAction.java */