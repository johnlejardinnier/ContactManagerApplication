/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Clear",
        id = "m1.piu.ClearAction"
)
@ActionRegistration(
        displayName = "#CTL_ClearAction"
)
@ActionReference(path = "Menu/File", position = 1300)
@Messages("CTL_ClearAction=Clear")
public final class ClearAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body

        NotifyDescriptor d
                = new NotifyDescriptor.Confirmation("Really do this?!", "Clear",
                        NotifyDescriptor.OK_CANCEL_OPTION);
        if (DialogDisplayer.getDefault().notify(d) == NotifyDescriptor.OK_OPTION) {
            
            DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message("Contacts cleared successfully :)",
                NotifyDescriptor.INFORMATION_MESSAGE));
            
        }

    }
}
