package FinalProjectData;

import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.util.List;

import javax.swing.*;

public class Test {

private static void main(String[] args) {
    JTextArea myPanel = new JTextArea();

    myPanel.setDropTarget(new DropTarget() {
        public synchronized void drop(DropTargetDropEvent evt) {
            try {
                evt.acceptDrop(DnDConstants.ACTION_COPY);
                List<File> droppedFiles = (List<File>) evt
                        .getTransferable().getTransferData(
                                DataFlavor.javaFileListFlavor);
                for (File file : droppedFiles) {
                    /*
                     * NOTE:
                     *  When I change this to a println,
                     *  it prints the correct path
                     */
                    myPanel.setText(file.getAbsolutePath());
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    });

    JFrame frame = new JFrame();
    frame.add(myPanel);
    frame.setVisible(true);

}

}
