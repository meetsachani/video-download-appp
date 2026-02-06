package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int a;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int b = iVersions.b(context, str);
        selectionResult.a = b;
        int i = 1;
        int i2 = 0;
        if (b != 0) {
            a = iVersions.a(context, str, false);
            selectionResult.b = a;
        } else {
            a = iVersions.a(context, str, true);
            selectionResult.b = a;
        }
        int i3 = selectionResult.a;
        if (i3 == 0) {
            if (a == 0) {
                i = 0;
                selectionResult.c = i;
                return selectionResult;
            }
        } else {
            i2 = i3;
        }
        if (i2 >= a) {
            i = -1;
        }
        selectionResult.c = i;
        return selectionResult;
    }
}
