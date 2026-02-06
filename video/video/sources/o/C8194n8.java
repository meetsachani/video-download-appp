package o;

import android.content.Context;
import android.content.DialogInterface;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.n8  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8194n8 {
    public static final C8194n8 a = new C8194n8();

    /* renamed from: o.n8$a */
    /* loaded from: classes3.dex */
    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ HA0 X;

        public a(HA0 ha0) {
            this.X = ha0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C6562gT0.p(this.X, "$doAction");
            this.X.invoke(Boolean.TRUE);
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: o.n8$b */
    /* loaded from: classes3.dex */
    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ HA0 X;

        public b(HA0 ha0) {
            this.X = ha0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C6562gT0.p(this.X, "$doAction");
            this.X.invoke(Boolean.FALSE);
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    public void a(Context context, HA0<? super Boolean, C7458kA2> ha0) {
        C6562gT0.p(context, "context");
        C6562gT0.p(ha0, "doAction");
        U81 u81 = new U81(context);
        u81.setTitle(context.getString(R.string.delete_alert));
        u81.l(context.getString(R.string.delete_description));
        u81.y(context.getString(R.string.delete), new a(ha0));
        u81.p(context.getString(R.string.dismiss), new b(ha0));
        u81.I();
    }
}
