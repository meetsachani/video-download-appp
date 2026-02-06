package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import o.KL;

/* renamed from: o.Hc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3122Hc {
    public static final String a = "ReceiveContent";

    /* renamed from: o.Hc$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C6516gH2.t1(textView, new KL.b(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        public static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C6516gH2.t1(view, new KL.b(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    public static boolean a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C6516gH2.m0(view) != null) {
            Activity c = c(view);
            if (c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                if (view instanceof TextView) {
                    return false;
                }
                return true;
            } else if (dragEvent.getAction() == 3) {
                if (view instanceof TextView) {
                    return a.a(dragEvent, (TextView) view, c);
                }
                return a.b(dragEvent, view, c);
            }
        }
        return false;
    }

    public static boolean b(TextView textView, int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C6516gH2.m0(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            primaryClip = null;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            KL.b bVar = new KL.b(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            C6516gH2.t1(textView, bVar.d(i2).a());
        }
        return true;
    }

    public static Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
