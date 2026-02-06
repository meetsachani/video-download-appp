package o;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* renamed from: o.bn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5413bn2 implements InterfaceC6414fv1 {
    public static final String a = "ReceiveContent";

    public static CharSequence b(Context context, ClipData.Item item, int i) {
        if ((i & 1) != 0) {
            CharSequence coerceToText = item.coerceToText(context);
            if (coerceToText instanceof Spanned) {
                return coerceToText.toString();
            }
            return coerceToText;
        }
        return item.coerceToStyledText(context);
    }

    public static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // o.InterfaceC6414fv1
    public KL a(View view, KL kl) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + kl);
        }
        if (kl.g() == 2) {
            return kl;
        }
        ClipData c = kl.c();
        int e = kl.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < c.getItemCount(); i++) {
            CharSequence b = b(context, c.getItemAt(i), e);
            if (b != null) {
                if (!z) {
                    c(editable, b);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b);
                }
            }
        }
        return null;
    }
}
