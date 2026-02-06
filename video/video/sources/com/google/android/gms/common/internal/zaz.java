package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes2.dex */
public final class zaz extends RemoteCreator<zam> {
    public static final zaz c = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        zaz zazVar = c;
        try {
            zax zaxVar = new zax(1, i, i2, null);
            return (View) ObjectWrapper.o1(zazVar.b(context).r4(ObjectWrapper.V3(context), zaxVar));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ zam a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof zam) {
            return (zam) queryLocalInterface;
        }
        return new zam(iBinder);
    }
}
