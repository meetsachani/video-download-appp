package o;

import android.content.Context;
import android.view.View;
import o.C10861y4;

/* loaded from: classes3.dex */
public class ED extends Q3 {
    public final C10861y4.a d;

    public ED(Context context, int i) {
        this.d = new C10861y4.a(16, context.getString(i));
    }

    @Override // o.Q3
    public void g(View view, C10861y4 c10861y4) {
        super.g(view, c10861y4);
        c10861y4.b(this.d);
    }
}
