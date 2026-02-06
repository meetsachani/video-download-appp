package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "WebImageCreator")
/* loaded from: classes2.dex */
public final class WebImage extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getUrl", id = 2)
    public final Uri Y;
    @SafeParcelable.Field(getter = "getHeight", id = 4)
    public final int Y0;
    @SafeParcelable.Field(getter = "getWidth", id = 3)
    public final int Z;

    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3) {
        this.X = i;
        this.Y = uri;
        this.Z = i2;
        this.Y0 = i3;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public JSONObject B0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.Y.toString());
            jSONObject.put("width", this.Z);
            jSONObject.put("height", this.Y0);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.b(this.Y, webImage.Y) && this.Z == webImage.Z && this.Y0 == webImage.Y0) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.Y0;
    }

    public int getWidth() {
        return this.Z;
    }

    public int hashCode() {
        return Objects.c(this.Y, Integer.valueOf(this.Z), Integer.valueOf(this.Y0));
    }

    @InterfaceC5670cr1
    public Uri m0() {
        return this.Y;
    }

    @InterfaceC5670cr1
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.Z), Integer.valueOf(this.Y0), this.Y.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.S(parcel, 2, m0(), i, false);
        SafeParcelWriter.F(parcel, 3, getWidth());
        SafeParcelWriter.F(parcel, 4, getHeight());
        SafeParcelWriter.b(parcel, a);
    }

    public WebImage(@InterfaceC5670cr1 Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(@InterfaceC5670cr1 Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebImage(@InterfaceC5670cr1 JSONObject jSONObject) throws IllegalArgumentException {
        this(r0, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
    }
}
