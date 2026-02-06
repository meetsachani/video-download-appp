package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtl;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class AdActivity extends Activity {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String Y = "com.google.android.gms.ads.AdActivity";
    @InterfaceC11300zs1
    public zzbtl X;

    public final void a() {
        zzbtl zzbtlVar = this.X;
        if (zzbtlVar != null) {
            try {
                zzbtlVar.y();
            } catch (RemoteException e) {
                zzo.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, @InterfaceC5670cr1 Intent intent) {
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.G5(i, i2, intent);
            }
        } catch (Exception e) {
            zzo.i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                if (!zzbtlVar.P()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbtl zzbtlVar2 = this.X;
            if (zzbtlVar2 != null) {
                zzbtlVar2.i();
            }
        } catch (RemoteException e2) {
            zzo.i("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@InterfaceC5670cr1 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.b0(ObjectWrapper.V3(configuration));
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(@InterfaceC11300zs1 Bundle bundle) {
        super.onCreate(bundle);
        zzo.b("AdActivity onCreate");
        zzbtl q = zzbb.a().q(this);
        this.X = q;
        if (q != null) {
            try {
                q.n3(bundle);
                return;
            } catch (RemoteException e) {
                zzo.i("#007 Could not call remote method.", e);
                finish();
                return;
            }
        }
        zzo.i("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        zzo.b("AdActivity onDestroy");
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.m();
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        zzo.b("AdActivity onPause");
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.p();
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, @InterfaceC5670cr1 String[] strArr, @InterfaceC5670cr1 int[] iArr) {
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.K2(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        zzo.b("AdActivity onRestart");
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.r();
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        zzo.b("AdActivity onResume");
        super.onResume();
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.x();
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@InterfaceC5670cr1 Bundle bundle) {
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.h1(bundle);
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        zzo.b("AdActivity onStart");
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.v();
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        zzo.b("AdActivity onStop");
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.t();
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbtl zzbtlVar = this.X;
            if (zzbtlVar != null) {
                zzbtlVar.q();
            }
        } catch (RemoteException e) {
            zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(@InterfaceC5670cr1 View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
