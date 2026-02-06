package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag b(Activity activity, @InterfaceC11300zs1 Intent intent, int i) {
        return new zad(intent, activity, i);
    }

    public static zag c(@InterfaceC5670cr1 Fragment fragment, @InterfaceC11300zs1 Intent intent, int i) {
        return new zae(intent, fragment, i);
    }

    public static zag d(@InterfaceC5670cr1 LifecycleFragment lifecycleFragment, @InterfaceC11300zs1 Intent intent, int i) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
