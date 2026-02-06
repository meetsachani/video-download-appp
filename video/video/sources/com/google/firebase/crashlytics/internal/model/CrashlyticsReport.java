package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User;
import com.google.firebase.encoders.annotations.Encodable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
@Encodable
/* loaded from: classes3.dex */
public abstract class CrashlyticsReport {
    public static final Charset a = Charset.forName("UTF-8");

    @InterfaceC6615gi
    /* loaded from: classes3.dex */
    public static abstract class ApplicationExitInfo {

        @InterfaceC6615gi
        /* loaded from: classes3.dex */
        public static abstract class BuildIdMappingForArch {

            @InterfaceC6615gi.a
            /* loaded from: classes3.dex */
            public static abstract class Builder {
                @InterfaceC5670cr1
                public abstract BuildIdMappingForArch a();

                @InterfaceC5670cr1
                public abstract Builder b(@InterfaceC5670cr1 String str);

                @InterfaceC5670cr1
                public abstract Builder c(@InterfaceC5670cr1 String str);

                @InterfaceC5670cr1
                public abstract Builder d(@InterfaceC5670cr1 String str);
            }

            @InterfaceC5670cr1
            public static Builder a() {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.Builder();
            }

            @InterfaceC5670cr1
            public abstract String b();

            @InterfaceC5670cr1
            public abstract String c();

            @InterfaceC5670cr1
            public abstract String d();
        }

        @InterfaceC6615gi.a
        /* loaded from: classes3.dex */
        public static abstract class Builder {
            @InterfaceC5670cr1
            public abstract ApplicationExitInfo a();

            @InterfaceC5670cr1
            public abstract Builder b(@InterfaceC11300zs1 List<BuildIdMappingForArch> list);

            @InterfaceC5670cr1
            public abstract Builder c(@InterfaceC5670cr1 int i);

            @InterfaceC5670cr1
            public abstract Builder d(@InterfaceC5670cr1 int i);

            @InterfaceC5670cr1
            public abstract Builder e(@InterfaceC5670cr1 String str);

            @InterfaceC5670cr1
            public abstract Builder f(@InterfaceC5670cr1 long j);

            @InterfaceC5670cr1
            public abstract Builder g(@InterfaceC5670cr1 int i);

            @InterfaceC5670cr1
            public abstract Builder h(@InterfaceC5670cr1 long j);

            @InterfaceC5670cr1
            public abstract Builder i(@InterfaceC5670cr1 long j);

            @InterfaceC5670cr1
            public abstract Builder j(@InterfaceC11300zs1 String str);
        }

        @InterfaceC5670cr1
        public static Builder a() {
            return new AutoValue_CrashlyticsReport_ApplicationExitInfo.Builder();
        }

        @InterfaceC11300zs1
        public abstract List<BuildIdMappingForArch> b();

        @InterfaceC5670cr1
        public abstract int c();

        @InterfaceC5670cr1
        public abstract int d();

        @InterfaceC5670cr1
        public abstract String e();

        @InterfaceC5670cr1
        public abstract long f();

        @InterfaceC5670cr1
        public abstract int g();

        @InterfaceC5670cr1
        public abstract long h();

        @InterfaceC5670cr1
        public abstract long i();

        @InterfaceC11300zs1
        public abstract String j();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Architecture {
        public static final int K = 5;
        public static final int L = 6;
        public static final int M = 9;
        public static final int N = 0;
        public static final int O = 1;
        public static final int P = 7;
    }

    @InterfaceC6615gi.a
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @InterfaceC5670cr1
        public abstract CrashlyticsReport a();

        @InterfaceC5670cr1
        public abstract Builder b(ApplicationExitInfo applicationExitInfo);

        @InterfaceC5670cr1
        public abstract Builder c(@InterfaceC11300zs1 String str);

        @InterfaceC5670cr1
        public abstract Builder d(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder e(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder f(@InterfaceC11300zs1 String str);

        @InterfaceC5670cr1
        public abstract Builder g(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder h(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder i(FilesPayload filesPayload);

        @InterfaceC5670cr1
        public abstract Builder j(int i);

        @InterfaceC5670cr1
        public abstract Builder k(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder l(@InterfaceC5670cr1 Session session);
    }

    @InterfaceC6615gi
    /* loaded from: classes3.dex */
    public static abstract class CustomAttribute {

        @InterfaceC6615gi.a
        /* loaded from: classes3.dex */
        public static abstract class Builder {
            @InterfaceC5670cr1
            public abstract CustomAttribute a();

            @InterfaceC5670cr1
            public abstract Builder b(@InterfaceC5670cr1 String str);

            @InterfaceC5670cr1
            public abstract Builder c(@InterfaceC5670cr1 String str);
        }

        @InterfaceC5670cr1
        public static Builder a() {
            return new AutoValue_CrashlyticsReport_CustomAttribute.Builder();
        }

        @InterfaceC5670cr1
        public abstract String b();

        @InterfaceC5670cr1
        public abstract String c();
    }

    @InterfaceC6615gi
    /* loaded from: classes3.dex */
    public static abstract class FilesPayload {

        @InterfaceC6615gi.a
        /* loaded from: classes3.dex */
        public static abstract class Builder {
            public abstract FilesPayload a();

            public abstract Builder b(List<File> list);

            public abstract Builder c(String str);
        }

        @InterfaceC6615gi
        /* loaded from: classes3.dex */
        public static abstract class File {

            @InterfaceC6615gi.a
            /* loaded from: classes3.dex */
            public static abstract class Builder {
                public abstract File a();

                public abstract Builder b(byte[] bArr);

                public abstract Builder c(String str);
            }

            @InterfaceC5670cr1
            public static Builder a() {
                return new AutoValue_CrashlyticsReport_FilesPayload_File.Builder();
            }

            @InterfaceC5670cr1
            public abstract byte[] b();

            @InterfaceC5670cr1
            public abstract String c();
        }

        @InterfaceC5670cr1
        public static Builder a() {
            return new AutoValue_CrashlyticsReport_FilesPayload.Builder();
        }

        @InterfaceC5670cr1
        public abstract List<File> b();

        @InterfaceC11300zs1
        public abstract String c();

        public abstract Builder d();
    }

    @InterfaceC6615gi
    /* loaded from: classes3.dex */
    public static abstract class Session {

        @InterfaceC6615gi
        /* loaded from: classes3.dex */
        public static abstract class Application {

            @InterfaceC6615gi.a
            /* loaded from: classes3.dex */
            public static abstract class Builder {
                @InterfaceC5670cr1
                public abstract Application a();

                @InterfaceC5670cr1
                public abstract Builder b(@InterfaceC11300zs1 String str);

                @InterfaceC5670cr1
                public abstract Builder c(@InterfaceC11300zs1 String str);

                @InterfaceC5670cr1
                public abstract Builder d(@InterfaceC5670cr1 String str);

                @InterfaceC5670cr1
                public abstract Builder e(@InterfaceC5670cr1 String str);

                @InterfaceC5670cr1
                public abstract Builder f(@InterfaceC5670cr1 String str);

                @InterfaceC5670cr1
                public abstract Builder g(@InterfaceC5670cr1 Organization organization);

                @InterfaceC5670cr1
                public abstract Builder h(@InterfaceC5670cr1 String str);
            }

            @InterfaceC6615gi
            /* loaded from: classes3.dex */
            public static abstract class Organization {

                @InterfaceC6615gi.a
                /* loaded from: classes3.dex */
                public static abstract class Builder {
                    @InterfaceC5670cr1
                    public abstract Organization a();

                    @InterfaceC5670cr1
                    public abstract Builder b(@InterfaceC5670cr1 String str);
                }

                @InterfaceC5670cr1
                public static Builder a() {
                    return new AutoValue_CrashlyticsReport_Session_Application_Organization.Builder();
                }

                @InterfaceC5670cr1
                public abstract String b();

                @InterfaceC5670cr1
                public abstract Builder c();
            }

            @InterfaceC5670cr1
            public static Builder a() {
                return new AutoValue_CrashlyticsReport_Session_Application.Builder();
            }

            @InterfaceC11300zs1
            public abstract String b();

            @InterfaceC11300zs1
            public abstract String c();

            @InterfaceC11300zs1
            public abstract String d();

            @InterfaceC5670cr1
            public abstract String e();

            @InterfaceC11300zs1
            public abstract String f();

            @InterfaceC11300zs1
            public abstract Organization g();

            @InterfaceC5670cr1
            public abstract String h();

            @InterfaceC5670cr1
            public abstract Builder i();

            @InterfaceC5670cr1
            public Application j(@InterfaceC5670cr1 String str) {
                Organization.Builder a;
                Organization g = g();
                if (g != null) {
                    a = g.c();
                } else {
                    a = Organization.a();
                }
                return i().g(a.b(str).a()).a();
            }
        }

        @InterfaceC6615gi.a
        /* loaded from: classes3.dex */
        public static abstract class Builder {
            @InterfaceC5670cr1
            public abstract Session a();

            @InterfaceC5670cr1
            public abstract Builder b(@InterfaceC5670cr1 Application application);

            @InterfaceC5670cr1
            public abstract Builder c(@InterfaceC11300zs1 String str);

            @InterfaceC5670cr1
            public abstract Builder d(boolean z);

            @InterfaceC5670cr1
            public abstract Builder e(@InterfaceC5670cr1 Device device);

            @InterfaceC5670cr1
            public abstract Builder f(@InterfaceC5670cr1 Long l);

            @InterfaceC5670cr1
            public abstract Builder g(@InterfaceC5670cr1 List<Event> list);

            @InterfaceC5670cr1
            public abstract Builder h(@InterfaceC5670cr1 String str);

            @InterfaceC5670cr1
            public abstract Builder i(int i);

            @InterfaceC5670cr1
            public abstract Builder j(@InterfaceC5670cr1 String str);

            @InterfaceC5670cr1
            public Builder k(@InterfaceC5670cr1 byte[] bArr) {
                return j(new String(bArr, CrashlyticsReport.a));
            }

            @InterfaceC5670cr1
            public abstract Builder l(@InterfaceC5670cr1 OperatingSystem operatingSystem);

            @InterfaceC5670cr1
            public abstract Builder m(long j);

            @InterfaceC5670cr1
            public abstract Builder n(@InterfaceC5670cr1 User user);
        }

        @InterfaceC6615gi
        /* loaded from: classes3.dex */
        public static abstract class Device {

            @InterfaceC6615gi.a
            /* loaded from: classes3.dex */
            public static abstract class Builder {
                @InterfaceC5670cr1
                public abstract Device a();

                @InterfaceC5670cr1
                public abstract Builder b(int i);

                @InterfaceC5670cr1
                public abstract Builder c(int i);

                @InterfaceC5670cr1
                public abstract Builder d(long j);

                @InterfaceC5670cr1
                public abstract Builder e(@InterfaceC5670cr1 String str);

                @InterfaceC5670cr1
                public abstract Builder f(@InterfaceC5670cr1 String str);

                @InterfaceC5670cr1
                public abstract Builder g(@InterfaceC5670cr1 String str);

                @InterfaceC5670cr1
                public abstract Builder h(long j);

                @InterfaceC5670cr1
                public abstract Builder i(boolean z);

                @InterfaceC5670cr1
                public abstract Builder j(int i);
            }

            @InterfaceC5670cr1
            public static Builder a() {
                return new AutoValue_CrashlyticsReport_Session_Device.Builder();
            }

            @InterfaceC5670cr1
            public abstract int b();

            public abstract int c();

            public abstract long d();

            @InterfaceC5670cr1
            public abstract String e();

            @InterfaceC5670cr1
            public abstract String f();

            @InterfaceC5670cr1
            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        @InterfaceC6615gi
        /* loaded from: classes3.dex */
        public static abstract class Event {

            @InterfaceC6615gi
            /* loaded from: classes3.dex */
            public static abstract class Application {

                @InterfaceC6615gi.a
                /* loaded from: classes3.dex */
                public static abstract class Builder {
                    @InterfaceC5670cr1
                    public abstract Application a();

                    @InterfaceC5670cr1
                    public abstract Builder b(@InterfaceC11300zs1 List<ProcessDetails> list);

                    @InterfaceC5670cr1
                    public abstract Builder c(@InterfaceC11300zs1 Boolean bool);

                    @InterfaceC5670cr1
                    public abstract Builder d(@InterfaceC11300zs1 ProcessDetails processDetails);

                    @InterfaceC5670cr1
                    public abstract Builder e(@InterfaceC5670cr1 List<CustomAttribute> list);

                    @InterfaceC5670cr1
                    public abstract Builder f(@InterfaceC5670cr1 Execution execution);

                    @InterfaceC5670cr1
                    public abstract Builder g(@InterfaceC5670cr1 List<CustomAttribute> list);

                    @InterfaceC5670cr1
                    public abstract Builder h(int i);
                }

                @InterfaceC6615gi
                /* loaded from: classes3.dex */
                public static abstract class Execution {

                    @InterfaceC6615gi
                    /* loaded from: classes3.dex */
                    public static abstract class BinaryImage {

                        @InterfaceC6615gi.a
                        /* loaded from: classes3.dex */
                        public static abstract class Builder {
                            @InterfaceC5670cr1
                            public abstract BinaryImage a();

                            @InterfaceC5670cr1
                            public abstract Builder b(long j);

                            @InterfaceC5670cr1
                            public abstract Builder c(@InterfaceC5670cr1 String str);

                            @InterfaceC5670cr1
                            public abstract Builder d(long j);

                            @InterfaceC5670cr1
                            public abstract Builder e(@InterfaceC11300zs1 String str);

                            @InterfaceC5670cr1
                            public Builder f(@InterfaceC5670cr1 byte[] bArr) {
                                return e(new String(bArr, CrashlyticsReport.a));
                            }
                        }

                        @InterfaceC5670cr1
                        public static Builder a() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.Builder();
                        }

                        @InterfaceC5670cr1
                        public abstract long b();

                        @InterfaceC5670cr1
                        public abstract String c();

                        public abstract long d();

                        @Encodable.Ignore
                        @InterfaceC11300zs1
                        public abstract String e();

                        @InterfaceC11300zs1
                        @Encodable.Field(name = "uuid")
                        public byte[] f() {
                            String e = e();
                            if (e != null) {
                                return e.getBytes(CrashlyticsReport.a);
                            }
                            return null;
                        }
                    }

                    @InterfaceC6615gi.a
                    /* loaded from: classes3.dex */
                    public static abstract class Builder {
                        @InterfaceC5670cr1
                        public abstract Execution a();

                        @InterfaceC5670cr1
                        public abstract Builder b(@InterfaceC5670cr1 ApplicationExitInfo applicationExitInfo);

                        @InterfaceC5670cr1
                        public abstract Builder c(@InterfaceC5670cr1 List<BinaryImage> list);

                        @InterfaceC5670cr1
                        public abstract Builder d(@InterfaceC5670cr1 Exception exception);

                        @InterfaceC5670cr1
                        public abstract Builder e(@InterfaceC5670cr1 Signal signal);

                        @InterfaceC5670cr1
                        public abstract Builder f(@InterfaceC5670cr1 List<Thread> list);
                    }

                    @InterfaceC6615gi
                    /* loaded from: classes3.dex */
                    public static abstract class Exception {

                        @InterfaceC6615gi.a
                        /* loaded from: classes3.dex */
                        public static abstract class Builder {
                            @InterfaceC5670cr1
                            public abstract Exception a();

                            @InterfaceC5670cr1
                            public abstract Builder b(@InterfaceC5670cr1 Exception exception);

                            @InterfaceC5670cr1
                            public abstract Builder c(@InterfaceC5670cr1 List<Thread.Frame> list);

                            @InterfaceC5670cr1
                            public abstract Builder d(int i);

                            @InterfaceC5670cr1
                            public abstract Builder e(@InterfaceC5670cr1 String str);

                            @InterfaceC5670cr1
                            public abstract Builder f(@InterfaceC5670cr1 String str);
                        }

                        @InterfaceC5670cr1
                        public static Builder a() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.Builder();
                        }

                        @InterfaceC11300zs1
                        public abstract Exception b();

                        @InterfaceC5670cr1
                        public abstract List<Thread.Frame> c();

                        public abstract int d();

                        @InterfaceC11300zs1
                        public abstract String e();

                        @InterfaceC5670cr1
                        public abstract String f();
                    }

                    @InterfaceC6615gi
                    /* loaded from: classes3.dex */
                    public static abstract class Signal {

                        @InterfaceC6615gi.a
                        /* loaded from: classes3.dex */
                        public static abstract class Builder {
                            @InterfaceC5670cr1
                            public abstract Signal a();

                            @InterfaceC5670cr1
                            public abstract Builder b(long j);

                            @InterfaceC5670cr1
                            public abstract Builder c(@InterfaceC5670cr1 String str);

                            @InterfaceC5670cr1
                            public abstract Builder d(@InterfaceC5670cr1 String str);
                        }

                        @InterfaceC5670cr1
                        public static Builder a() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.Builder();
                        }

                        @InterfaceC5670cr1
                        public abstract long b();

                        @InterfaceC5670cr1
                        public abstract String c();

                        @InterfaceC5670cr1
                        public abstract String d();
                    }

                    @InterfaceC6615gi
                    /* loaded from: classes3.dex */
                    public static abstract class Thread {

                        @InterfaceC6615gi.a
                        /* loaded from: classes3.dex */
                        public static abstract class Builder {
                            @InterfaceC5670cr1
                            public abstract Thread a();

                            @InterfaceC5670cr1
                            public abstract Builder b(@InterfaceC5670cr1 List<Frame> list);

                            @InterfaceC5670cr1
                            public abstract Builder c(int i);

                            @InterfaceC5670cr1
                            public abstract Builder d(@InterfaceC5670cr1 String str);
                        }

                        @InterfaceC6615gi
                        /* loaded from: classes3.dex */
                        public static abstract class Frame {

                            @InterfaceC6615gi.a
                            /* loaded from: classes3.dex */
                            public static abstract class Builder {
                                @InterfaceC5670cr1
                                public abstract Frame a();

                                @InterfaceC5670cr1
                                public abstract Builder b(@InterfaceC5670cr1 String str);

                                @InterfaceC5670cr1
                                public abstract Builder c(int i);

                                @InterfaceC5670cr1
                                public abstract Builder d(long j);

                                @InterfaceC5670cr1
                                public abstract Builder e(long j);

                                @InterfaceC5670cr1
                                public abstract Builder f(@InterfaceC5670cr1 String str);
                            }

                            @InterfaceC5670cr1
                            public static Builder a() {
                                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.Builder();
                            }

                            @InterfaceC11300zs1
                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            @InterfaceC5670cr1
                            public abstract String f();
                        }

                        @InterfaceC5670cr1
                        public static Builder a() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.Builder();
                        }

                        @InterfaceC5670cr1
                        public abstract List<Frame> b();

                        public abstract int c();

                        @InterfaceC5670cr1
                        public abstract String d();
                    }

                    @InterfaceC5670cr1
                    public static Builder a() {
                        return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder();
                    }

                    @InterfaceC11300zs1
                    public abstract ApplicationExitInfo b();

                    @InterfaceC5670cr1
                    public abstract List<BinaryImage> c();

                    @InterfaceC11300zs1
                    public abstract Exception d();

                    @InterfaceC5670cr1
                    public abstract Signal e();

                    @InterfaceC11300zs1
                    public abstract List<Thread> f();
                }

                @InterfaceC6615gi
                /* loaded from: classes3.dex */
                public static abstract class ProcessDetails {

                    @InterfaceC6615gi.a
                    /* loaded from: classes3.dex */
                    public static abstract class Builder {
                        @InterfaceC5670cr1
                        public abstract ProcessDetails a();

                        @InterfaceC5670cr1
                        public abstract Builder b(boolean z);

                        @InterfaceC5670cr1
                        public abstract Builder c(int i);

                        @InterfaceC5670cr1
                        public abstract Builder d(int i);

                        @InterfaceC5670cr1
                        public abstract Builder e(@InterfaceC5670cr1 String str);
                    }

                    @InterfaceC5670cr1
                    public static Builder a() {
                        return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.Builder();
                    }

                    public abstract int b();

                    public abstract int c();

                    @InterfaceC5670cr1
                    public abstract String d();

                    public abstract boolean e();
                }

                @InterfaceC5670cr1
                public static Builder a() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Application.Builder();
                }

                @InterfaceC11300zs1
                public abstract List<ProcessDetails> b();

                @InterfaceC11300zs1
                public abstract Boolean c();

                @InterfaceC11300zs1
                public abstract ProcessDetails d();

                @InterfaceC11300zs1
                public abstract List<CustomAttribute> e();

                @InterfaceC5670cr1
                public abstract Execution f();

                @InterfaceC11300zs1
                public abstract List<CustomAttribute> g();

                public abstract int h();

                @InterfaceC5670cr1
                public abstract Builder i();
            }

            @InterfaceC6615gi.a
            /* loaded from: classes3.dex */
            public static abstract class Builder {
                @InterfaceC5670cr1
                public abstract Event a();

                @InterfaceC5670cr1
                public abstract Builder b(@InterfaceC5670cr1 Application application);

                @InterfaceC5670cr1
                public abstract Builder c(@InterfaceC5670cr1 Device device);

                @InterfaceC5670cr1
                public abstract Builder d(@InterfaceC5670cr1 Log log);

                @InterfaceC11300zs1
                public abstract Builder e(@InterfaceC5670cr1 RolloutsState rolloutsState);

                @InterfaceC5670cr1
                public abstract Builder f(long j);

                @InterfaceC5670cr1
                public abstract Builder g(@InterfaceC5670cr1 String str);
            }

            @InterfaceC6615gi
            /* loaded from: classes3.dex */
            public static abstract class Device {

                @InterfaceC6615gi.a
                /* loaded from: classes3.dex */
                public static abstract class Builder {
                    @InterfaceC5670cr1
                    public abstract Device a();

                    @InterfaceC5670cr1
                    public abstract Builder b(Double d);

                    @InterfaceC5670cr1
                    public abstract Builder c(int i);

                    @InterfaceC5670cr1
                    public abstract Builder d(long j);

                    @InterfaceC5670cr1
                    public abstract Builder e(int i);

                    @InterfaceC5670cr1
                    public abstract Builder f(boolean z);

                    @InterfaceC5670cr1
                    public abstract Builder g(long j);
                }

                @InterfaceC5670cr1
                public static Builder a() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Device.Builder();
                }

                @InterfaceC11300zs1
                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            @InterfaceC6615gi
            /* loaded from: classes3.dex */
            public static abstract class Log {

                @InterfaceC6615gi.a
                /* loaded from: classes3.dex */
                public static abstract class Builder {
                    @InterfaceC5670cr1
                    public abstract Log a();

                    @InterfaceC5670cr1
                    public abstract Builder b(@InterfaceC5670cr1 String str);
                }

                @InterfaceC5670cr1
                public static Builder a() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Log.Builder();
                }

                @InterfaceC5670cr1
                public abstract String b();
            }

            @InterfaceC6615gi
            /* loaded from: classes3.dex */
            public static abstract class RolloutAssignment {

                @InterfaceC6615gi.a
                /* loaded from: classes3.dex */
                public static abstract class Builder {
                    @InterfaceC5670cr1
                    public abstract RolloutAssignment a();

                    @InterfaceC5670cr1
                    public abstract Builder b(@InterfaceC5670cr1 String str);

                    @InterfaceC5670cr1
                    public abstract Builder c(@InterfaceC5670cr1 String str);

                    @InterfaceC5670cr1
                    public abstract Builder d(@InterfaceC5670cr1 RolloutVariant rolloutVariant);

                    @InterfaceC5670cr1
                    public abstract Builder e(@InterfaceC5670cr1 long j);
                }

                @InterfaceC6615gi
                /* loaded from: classes3.dex */
                public static abstract class RolloutVariant {

                    @InterfaceC6615gi.a
                    /* loaded from: classes3.dex */
                    public static abstract class Builder {
                        @InterfaceC5670cr1
                        public abstract RolloutVariant a();

                        @InterfaceC5670cr1
                        public abstract Builder b(@InterfaceC5670cr1 String str);

                        @InterfaceC5670cr1
                        public abstract Builder c(@InterfaceC5670cr1 String str);
                    }

                    public static Builder a() {
                        return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.Builder();
                    }

                    @InterfaceC5670cr1
                    public abstract String b();

                    @InterfaceC5670cr1
                    public abstract String c();
                }

                @InterfaceC5670cr1
                public static Builder a() {
                    return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.Builder();
                }

                @InterfaceC5670cr1
                public abstract String b();

                @InterfaceC5670cr1
                public abstract String c();

                @InterfaceC5670cr1
                public abstract RolloutVariant d();

                @InterfaceC5670cr1
                public abstract long e();
            }

            @InterfaceC6615gi
            /* loaded from: classes3.dex */
            public static abstract class RolloutsState {

                @InterfaceC6615gi.a
                /* loaded from: classes3.dex */
                public static abstract class Builder {
                    @InterfaceC5670cr1
                    public abstract RolloutsState a();

                    @InterfaceC5670cr1
                    public abstract Builder b(@InterfaceC11300zs1 List<RolloutAssignment> list);
                }

                @InterfaceC5670cr1
                public static Builder a() {
                    return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState.Builder();
                }

                @InterfaceC5670cr1
                @Encodable.Field(name = "assignments")
                public abstract List<RolloutAssignment> b();
            }

            @InterfaceC5670cr1
            public static Builder a() {
                return new AutoValue_CrashlyticsReport_Session_Event.Builder();
            }

            @InterfaceC5670cr1
            public abstract Application b();

            @InterfaceC5670cr1
            public abstract Device c();

            @InterfaceC11300zs1
            public abstract Log d();

            @InterfaceC11300zs1
            public abstract RolloutsState e();

            public abstract long f();

            @InterfaceC5670cr1
            public abstract String g();

            @InterfaceC5670cr1
            public abstract Builder h();
        }

        @InterfaceC6615gi
        /* loaded from: classes3.dex */
        public static abstract class OperatingSystem {

            @InterfaceC6615gi.a
            /* loaded from: classes3.dex */
            public static abstract class Builder {
                @InterfaceC5670cr1
                public abstract OperatingSystem a();

                @InterfaceC5670cr1
                public abstract Builder b(@InterfaceC5670cr1 String str);

                @InterfaceC5670cr1
                public abstract Builder c(boolean z);

                @InterfaceC5670cr1
                public abstract Builder d(int i);

                @InterfaceC5670cr1
                public abstract Builder e(@InterfaceC5670cr1 String str);
            }

            @InterfaceC5670cr1
            public static Builder a() {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder();
            }

            @InterfaceC5670cr1
            public abstract String b();

            public abstract int c();

            @InterfaceC5670cr1
            public abstract String d();

            public abstract boolean e();
        }

        @InterfaceC6615gi
        /* loaded from: classes3.dex */
        public static abstract class User {

            @InterfaceC6615gi.a
            /* loaded from: classes3.dex */
            public static abstract class Builder {
                @InterfaceC5670cr1
                public abstract User a();

                @InterfaceC5670cr1
                public abstract Builder b(@InterfaceC5670cr1 String str);
            }

            @InterfaceC5670cr1
            public static Builder a() {
                return new AutoValue_CrashlyticsReport_Session_User.Builder();
            }

            @InterfaceC5670cr1
            public abstract String b();
        }

        @InterfaceC5670cr1
        public static Builder a() {
            return new AutoValue_CrashlyticsReport_Session.Builder().d(false);
        }

        @InterfaceC5670cr1
        public abstract Application b();

        @InterfaceC11300zs1
        public abstract String c();

        @InterfaceC11300zs1
        public abstract Device d();

        @InterfaceC11300zs1
        public abstract Long e();

        @InterfaceC11300zs1
        public abstract List<Event> f();

        @InterfaceC5670cr1
        public abstract String g();

        public abstract int h();

        @Encodable.Ignore
        @InterfaceC5670cr1
        public abstract String i();

        @InterfaceC5670cr1
        @Encodable.Field(name = "identifier")
        public byte[] j() {
            return i().getBytes(CrashlyticsReport.a);
        }

        @InterfaceC11300zs1
        public abstract OperatingSystem k();

        public abstract long l();

        @InterfaceC11300zs1
        public abstract User m();

        public abstract boolean n();

        @InterfaceC5670cr1
        public abstract Builder o();

        @InterfaceC5670cr1
        public Session p(@InterfaceC11300zs1 String str) {
            return o().c(str).a();
        }

        @InterfaceC5670cr1
        public Session q(@InterfaceC5670cr1 List<Event> list) {
            return o().g(list).a();
        }

        @InterfaceC5670cr1
        public Session r(@InterfaceC5670cr1 String str) {
            return o().b(b().j(str)).a();
        }

        @InterfaceC5670cr1
        public Session s(long j, boolean z, @InterfaceC11300zs1 String str) {
            Builder o2 = o();
            o2.f(Long.valueOf(j));
            o2.d(z);
            if (str != null) {
                o2.n(User.a().b(str).a());
            }
            return o2.a();
        }
    }

    /* loaded from: classes3.dex */
    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @InterfaceC5670cr1
    public static Builder b() {
        return new AutoValue_CrashlyticsReport.Builder();
    }

    @InterfaceC11300zs1
    public abstract ApplicationExitInfo c();

    @InterfaceC11300zs1
    public abstract String d();

    @InterfaceC5670cr1
    public abstract String e();

    @InterfaceC5670cr1
    public abstract String f();

    @InterfaceC11300zs1
    public abstract String g();

    @InterfaceC5670cr1
    public abstract String h();

    @InterfaceC5670cr1
    public abstract String i();

    @InterfaceC11300zs1
    public abstract FilesPayload j();

    public abstract int k();

    @InterfaceC5670cr1
    public abstract String l();

    @InterfaceC11300zs1
    public abstract Session m();

    @Encodable.Ignore
    public Type n() {
        if (m() != null) {
            return Type.JAVA;
        }
        if (j() != null) {
            return Type.NATIVE;
        }
        return Type.INCOMPLETE;
    }

    @InterfaceC5670cr1
    public abstract Builder o();

    @InterfaceC5670cr1
    public CrashlyticsReport p(@InterfaceC11300zs1 String str) {
        Builder c = o().c(str);
        if (m() != null) {
            c.l(m().p(str));
        }
        return c.a();
    }

    @InterfaceC5670cr1
    public CrashlyticsReport q(ApplicationExitInfo applicationExitInfo) {
        if (applicationExitInfo == null) {
            return this;
        }
        return o().b(applicationExitInfo).a();
    }

    @InterfaceC5670cr1
    public CrashlyticsReport r(@InterfaceC5670cr1 List<Session.Event> list) {
        if (m() != null) {
            return o().l(m().q(list)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @InterfaceC5670cr1
    public CrashlyticsReport s(@InterfaceC11300zs1 String str) {
        return o().f(str).a();
    }

    @InterfaceC5670cr1
    public CrashlyticsReport t(@InterfaceC5670cr1 FilesPayload filesPayload) {
        return o().l(null).i(filesPayload).a();
    }

    @InterfaceC5670cr1
    public CrashlyticsReport u(@InterfaceC5670cr1 String str) {
        Builder o2 = o();
        FilesPayload j = j();
        if (j != null) {
            o2.i(j.d().c(str).a());
        }
        Session m = m();
        if (m != null) {
            o2.l(m.r(str));
        }
        return o2.a();
    }

    @InterfaceC5670cr1
    public CrashlyticsReport v(long j, boolean z, @InterfaceC11300zs1 String str) {
        Builder o2 = o();
        if (m() != null) {
            o2.l(m().s(j, z, str));
        }
        return o2.a();
    }
}
