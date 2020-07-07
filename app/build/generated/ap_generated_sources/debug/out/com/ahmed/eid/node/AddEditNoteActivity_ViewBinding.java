// Generated code from Butter Knife. Do not modify!
package com.ahmed.eid.node;

import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddEditNoteActivity_ViewBinding implements Unbinder {
  private AddEditNoteActivity target;

  @UiThread
  public AddEditNoteActivity_ViewBinding(AddEditNoteActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddEditNoteActivity_ViewBinding(AddEditNoteActivity target, View source) {
    this.target = target;

    target.addEditNoteTitle = Utils.findRequiredViewAsType(source, R.id.add_edit_note_title, "field 'addEditNoteTitle'", EditText.class);
    target.addEditNoteDescription = Utils.findRequiredViewAsType(source, R.id.add_edit_note_description, "field 'addEditNoteDescription'", EditText.class);
    target.addEditNotePriority = Utils.findRequiredViewAsType(source, R.id.add_edit_note_priority, "field 'addEditNotePriority'", NumberPicker.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddEditNoteActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.addEditNoteTitle = null;
    target.addEditNoteDescription = null;
    target.addEditNotePriority = null;
  }
}
