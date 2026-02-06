package o;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;

/* renamed from: o.Aa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2417Aa {
    public static final C2417Aa a = new C2417Aa();

    public final void a(Activity activity, Rect rect) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        C6562gT0.p(rect, "hint");
        activity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(rect).build());
    }
}
