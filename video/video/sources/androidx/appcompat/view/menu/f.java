package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.j;
import o.OL1;

/* loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {
    public e X;
    public androidx.appcompat.app.a Y;
    public j.a Y0;
    public c Z;

    public f(e eVar) {
        this.X = eVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void a(e eVar, boolean z) {
        if (z || eVar == this.X) {
            c();
        }
        j.a aVar = this.Y0;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean b(e eVar) {
        j.a aVar = this.Y0;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.a aVar = this.Y;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public void d(j.a aVar) {
        this.Y0 = aVar;
    }

    public void e(IBinder iBinder) {
        e eVar = this.X;
        a.C0006a c0006a = new a.C0006a(eVar.x());
        c cVar = new c(c0006a.getContext(), OL1.j.q);
        this.Z = cVar;
        cVar.d(this);
        this.X.b(this.Z);
        c0006a.a(this.Z.b(), this);
        View B = eVar.B();
        if (B != null) {
            c0006a.d(B);
        } else {
            c0006a.f(eVar.z()).setTitle(eVar.A());
        }
        c0006a.x(this);
        androidx.appcompat.app.a create = c0006a.create();
        this.Y = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.Y.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.Y.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.X.P((h) this.Z.b().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.Z.a(this.X, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.Y.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.Y.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.X.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.X.performShortcut(i, keyEvent, 0);
    }
}
