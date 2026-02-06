package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class Mu2 {
    public final Intent a;
    public final List<Uri> b;

    public Mu2(Intent intent, List<Uri> list) {
        this.a = intent;
        this.b = list;
    }

    public Intent a() {
        return this.a;
    }

    public final void b(Context context) {
        for (Uri uri : this.b) {
            context.grantUriPermission(this.a.getPackage(), uri, 1);
        }
    }

    public void c(Context context) {
        b(context);
        C10201vM.A(context, this.a, null);
    }
}
