package o;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: o.Oc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3807Oc {
    public TextView a;
    public TextClassifier b;

    /* renamed from: o.Oc$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public C3807Oc(TextView textView) {
        this.a = (TextView) C10907yF1.l(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.b;
        if (textClassifier == null) {
            return a.a(this.a);
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}
