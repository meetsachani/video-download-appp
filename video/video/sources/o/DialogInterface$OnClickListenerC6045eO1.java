package o;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import o.C6968i90;

/* renamed from: o.eO1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class DialogInterface$OnClickListenerC6045eO1 implements DialogInterface.OnClickListener {
    public Object X;
    public C6288fO1 Y;
    public C6968i90.b Y0;
    public C6968i90.a Z;

    public DialogInterface$OnClickListenerC6045eO1(C7029iO1 c7029iO1, C6288fO1 c6288fO1, C6968i90.a aVar, C6968i90.b bVar) {
        Object o2;
        if (c7029iO1.N() != null) {
            o2 = c7029iO1.N();
        } else {
            o2 = c7029iO1.o();
        }
        this.X = o2;
        this.Y = c6288fO1;
        this.Z = aVar;
        this.Y0 = bVar;
    }

    public final void a() {
        C6968i90.a aVar = this.Z;
        if (aVar != null) {
            C6288fO1 c6288fO1 = this.Y;
            aVar.q(c6288fO1.d, Arrays.asList(c6288fO1.f));
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        C6288fO1 c6288fO1 = this.Y;
        int i2 = c6288fO1.d;
        if (i == -1) {
            String[] strArr = c6288fO1.f;
            C6968i90.b bVar = this.Y0;
            if (bVar != null) {
                bVar.b(i2);
            }
            Object obj = this.X;
            if (obj instanceof Fragment) {
                FC1.e((Fragment) obj).a(i2, strArr);
                return;
            } else if (obj instanceof Activity) {
                FC1.d((Activity) obj).a(i2, strArr);
                return;
            } else {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
        }
        C6968i90.b bVar2 = this.Y0;
        if (bVar2 != null) {
            bVar2.a(i2);
        }
        a();
    }

    public DialogInterface$OnClickListenerC6045eO1(DialogFragmentC6786hO1 dialogFragmentC6786hO1, C6288fO1 c6288fO1, C6968i90.a aVar, C6968i90.b bVar) {
        this.X = dialogFragmentC6786hO1.getActivity();
        this.Y = c6288fO1;
        this.Z = aVar;
        this.Y0 = bVar;
    }
}
