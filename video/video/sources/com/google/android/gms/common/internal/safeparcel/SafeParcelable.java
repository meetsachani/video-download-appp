package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface SafeParcelable extends Parcelable {
    @InterfaceC5670cr1
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* loaded from: classes2.dex */
    public @interface Class {
        @InterfaceC5670cr1
        String creator();

        boolean creatorIsFinal() default true;

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* loaded from: classes2.dex */
    public @interface Constructor {
    }

    /* loaded from: classes2.dex */
    public @interface Field {
        @InterfaceC5670cr1
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @InterfaceC5670cr1
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @InterfaceC5670cr1
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @InterfaceC5670cr1
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes2.dex */
    public @interface Indicator {
        @InterfaceC5670cr1
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes2.dex */
    public @interface Param {
        int id();
    }

    /* loaded from: classes2.dex */
    public @interface RemovedParam {
        @InterfaceC5670cr1
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @InterfaceC5670cr1
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* loaded from: classes2.dex */
    public @interface Reserved {
        @InterfaceC5670cr1
        int[] value();
    }

    /* loaded from: classes2.dex */
    public @interface VersionField {
        @InterfaceC5670cr1
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @InterfaceC5670cr1
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
