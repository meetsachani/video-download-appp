package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zae implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 2:
                    arrayList = SafeParcelReader.L(parcel, X, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.C(parcel, X, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 5:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 6:
                    z3 = SafeParcelReader.P(parcel, X);
                    break;
                case 7:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 8:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.L(parcel, X, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
