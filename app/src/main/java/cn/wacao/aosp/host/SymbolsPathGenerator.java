package cn.wacao.aosp.host;

import java.io.File;

public class SymbolsPathGenerator {
    public static final String CHAR_SPACE = " ";
    public static final String[] IGNORE = {"libjavacore-benchmarks32",
            "bsdiff_unittest", "libjavacore-unit-tests", "memory_replay_tests32",
            "libandroid.so", "libc.so", "libdl.so", "libEGL.so", "libGLESv1_CM.so",
            "libGLESv2.so", "libjnigraphics.so", "liblog.so", "libm.so",
            "libOpenSLES.so", "libstdc++.so", "libz.so", "libOpenMAXAL.so",
            "libGLESv3.so", "libmediandk.so", "libcamera2ndk.so", "libvulkan.so",
            "libaaudio.so", "libnativewindow.so", "libsync.so",
            "libneuralnetworks.so", "app_process32", "audioserver",
            "cameraserver", "crash_dump32", "dalvikvm32", "dex2oat",
            "dex2oatd", "dexdump", "dexoptanalyzer", "dexoptanalyzerd",
            "drmserver", "linker", "mediadrmserver", "mediaserver",
            "memory_replay32", "memtest", "patchoat", "patchoatd",
            "profman", "profmand", "webview_zygote32", "micro_bench",
            "micro_bench_static", "simpleperf32", "android.hardware.audio@2.0-service",
            "android.hardware.camera.provider@2.4-service",
            "android.hardware.cas@1.0-service", "android.hardware.drm@1.0-service",
            "android.hardware.media.omx@1.0-service"};

    public static final String[] IGNORE_DIR = {"fake-libs\\", "fake-libs64\\",
            "symbols\\system\\framework\\arm\\", "symbols\\system\\lib\\",
            "symbols\\vendor\\lib\\"};

    public static final String DEVICES_IMAGE_LIST = "[  0] 789CB876-CA6D-7EA6-3179-DB697BD80430                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\789CB876-CA6D-7EA6-3179-DB697BD80430\\app_process64 \n" +
            "[  1] 29B74447-0000-0000-0000-000000000000 0x0000007520fb4000 [vdso] (0x0000007520fb4000)\n" +
            "[  2] E20953BE-C2E3-5DC2-DD53-B4B7BCED2E69                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\E20953BE-C2E3-5DC2-DD53-B4B7BCED2E69\\linker64 \n" +
            "[  3] 2E1EFF77-61BB-A62B-62BA-6A7EC6F27D0F                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\2E1EFF77-61BB-A62B-62BA-6A7EC6F27D0F\\libandroid_runtime.so \n" +
            "[  4] CE4F83DC-68A1-329D-FF08-563F0DBB77AC                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\CE4F83DC-68A1-329D-FF08-563F0DBB77AC\\libbinder.so \n" +
            "[  5] D53A6121-EC80-C183-3E71-DACECD1D4735                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D53A6121-EC80-C183-3E71-DACECD1D4735\\libcutils.so \n" +
            "[  6] 94450B4B-C315-4C10-9EF6-2A4EBB4404F4                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\94450B4B-C315-4C10-9EF6-2A4EBB4404F4\\libhwbinder.so \n" +
            "[  7] BC9E2073-D364-8AC6-152C-461AB165B7CC                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\BC9E2073-D364-8AC6-152C-461AB165B7CC\\liblog.so \n" +
            "[  8] 7D7D7F83-6E1C-83E7-E06F-47BCB492381A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\7D7D7F83-6E1C-83E7-E06F-47BCB492381A\\libnativeloader.so \n" +
            "[  9] F7874A3B-DCA4-AD71-3669-A344DD09473A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\F7874A3B-DCA4-AD71-3669-A344DD09473A\\libutils.so \n" +
            "[ 10] B1933C60-0169-181B-3F1E-31D15CD7E9D8                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B1933C60-0169-181B-3F1E-31D15CD7E9D8\\libwilhelm.so \n" +
            "[ 11] 4A9D2A2B-A883-F042-2507-F98E6B25B739                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\4A9D2A2B-A883-F042-2507-F98E6B25B739\\libc++.so \n" +
            "[ 12] EE7627EA-BFC5-581B-7E87-CB12D307B357                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\EE7627EA-BFC5-581B-7E87-CB12D307B357\\libc.so \n" +
            "[ 13] B449AB5D-80B1-5D35-55CF-4916411BE8F9                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B449AB5D-80B1-5D35-55CF-4916411BE8F9\\libm.so \n" +
            "[ 14] 8820AA42-0E50-0AC5-751E-6DA4A9B44427                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\8820AA42-0E50-0AC5-751E-6DA4A9B44427\\libdl.so \n" +
            "[ 15] 36295A83-0638-E248-0130-2C80330AF6E4                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\36295A83-0638-E248-0130-2C80330AF6E4\\libmemtrack.so \n" +
            "[ 16] 65F983DC-1876-AFB8-CE9D-6DA5C48DBF2A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\65F983DC-1876-AFB8-CE9D-6DA5C48DBF2A\\libandroidfw.so \n" +
            "[ 17] 7C8E0F87-88CD-0EC4-2623-9DDEC0B4A64F                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\7C8E0F87-88CD-0EC4-2623-9DDEC0B4A64F\\libappfuse.so \n" +
            "[ 18] 254014F8-E582-1BA9-693E-974467D490CE                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\254014F8-E582-1BA9-693E-974467D490CE\\libbase.so \n" +
            "[ 19] 5FDE5761-70AD-F534-1D11-6C5DFBBE0814                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5FDE5761-70AD-F534-1D11-6C5DFBBE0814\\libcrypto.so \n" +
            "[ 20] 282A3DED-3FBA-B3A3-5314-C7742DA4CDD7                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\282A3DED-3FBA-B3A3-5314-C7742DA4CDD7\\libnativehelper.so \n" +
            "[ 21] 984E23F7-2366-6535-005D-B1BEECA9C30F                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\984E23F7-2366-6535-005D-B1BEECA9C30F\\libdebuggerd_client.so \n" +
            "[ 22] 4764EB10-3377-C637-8969-96E7905E7534                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\4764EB10-3377-C637-8969-96E7905E7534\\libui.so \n" +
            "[ 23] 2BE72F6A-9FB2-85D8-FC72-727CF3E3D48A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\2BE72F6A-9FB2-85D8-FC72-727CF3E3D48A\\libgraphicsenv.so \n" +
            "[ 24] 6AD8BC0B-0CC2-A5EA-BE76-FF4F65A88B6F                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\6AD8BC0B-0CC2-A5EA-BE76-FF4F65A88B6F\\libgui.so \n" +
            "[ 25] B2B8A85A-7AED-4E23-7BA1-F54740AAFC95                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B2B8A85A-7AED-4E23-7BA1-F54740AAFC95\\libsensor.so \n" +
            "[ 26] 0BB0740D-48AC-5840-2710-494077B00867                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\0BB0740D-48AC-5840-2710-494077B00867\\libinput.so \n" +
            "[ 27] CB59B76F-A987-171A-AA79-09C5EC2C01D7                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\CB59B76F-A987-171A-AA79-09C5EC2C01D7\\libcamera_client.so \n" +
            "[ 28] 5D50586F-8ADB-3B51-CBCA-B9C938723722                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5D50586F-8ADB-3B51-CBCA-B9C938723722\\libcamera_metadata.so \n" +
            "[ 29] 3818DEA6-BCFB-A8AE-57DE-DD37282E24D0                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\3818DEA6-BCFB-A8AE-57DE-DD37282E24D0\\libskia.so \n" +
            "[ 30] E2C33ADD-E955-996C-61B7-8EF0EAB5AEA8                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\E2C33ADD-E955-996C-61B7-8EF0EAB5AEA8\\libsqlite.so \n" +
            "[ 31] FFE0EFD8-0EFA-5D48-F13E-2BA588FC2995                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\FFE0EFD8-0EFA-5D48-F13E-2BA588FC2995\\libEGL.so \n" +
            "[ 32] 9308359C-2FF4-2DCB-AC83-FD0ED4215603                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\9308359C-2FF4-2DCB-AC83-FD0ED4215603\\libGLESv1_CM.so \n" +
            "[ 33] 37F7451F-7FFE-2BEE-C369-A4FECB014463                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\37F7451F-7FFE-2BEE-C369-A4FECB014463\\libGLESv2.so \n" +
            "[ 34] 540CBB11-66EA-FCE6-3843-B5661A374838                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\540CBB11-66EA-FCE6-3843-B5661A374838\\libvulkan.so \n" +
            "[ 35] 03B50DE7-373C-F734-7C3F-AFD6FA1FCE03                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\03B50DE7-373C-F734-7C3F-AFD6FA1FCE03\\libziparchive.so \n" +
            "[ 36] 0B30F53C-B7D9-4636-C3F3-6793BC46A309                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\0B30F53C-B7D9-4636-C3F3-6793BC46A309\\libETC1.so \n" +
            "[ 37] 649504FA-B2F0-4C99-D8A5-D81F7002CB0A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\649504FA-B2F0-4C99-D8A5-D81F7002CB0A\\libhardware.so \n" +
            "[ 38] 3EF73627-10F8-D347-F17C-C167283EDEB8                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\3EF73627-10F8-D347-F17C-C167283EDEB8\\libhardware_legacy.so \n" +
            "[ 39] 272B16C7-04DD-4BD9-5077-B127488329CB                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\272B16C7-04DD-4BD9-5077-B127488329CB\\libselinux.so \n" +
            "[ 40] 4F3491BE-251D-DBC9-C696-478EC990F337                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\4F3491BE-251D-DBC9-C696-478EC990F337\\libicuuc.so \n" +
            "[ 41] 1BEBCE02-403E-BE20-ACA4-A0ACCA62782A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\1BEBCE02-403E-BE20-ACA4-A0ACCA62782A\\libmedia.so \n" +
            "[ 42] 5F7CEE91-4581-CA5D-671C-7CF9CAAB382A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5F7CEE91-4581-CA5D-671C-7CF9CAAB382A\\libaudioclient.so \n" +
            "[ 43] 58E325D7-C861-DBBB-F488-A1806CE8DC18                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\58E325D7-C861-DBBB-F488-A1806CE8DC18\\libjpeg.so \n" +
            "[ 44] 237B9E1B-03FD-35A2-B407-6D98EDB11C7F                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\237B9E1B-03FD-35A2-B407-6D98EDB11C7F\\libusbhost.so \n" +
            "[ 45] 441F7B9F-E30D-2CBB-7FC7-076230782A6D                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\441F7B9F-E30D-2CBB-7FC7-076230782A6D\\libharfbuzz_ng.so \n" +
            "[ 46] 0C4E622A-7B04-4395-7052-D716EA38CB33                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\0C4E622A-7B04-4395-7052-D716EA38CB33\\libz.so \n" +
            "[ 47] BFE87F5E-841A-87C4-C925-C80757676F50                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\BFE87F5E-841A-87C4-C925-C80757676F50\\libpdfium.so \n" +
            "[ 48] 5406C5AE-2756-AC32-FAD4-5C75C00FAEBC                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5406C5AE-2756-AC32-FAD4-5C75C00FAEBC\\libimg_utils.so \n" +
            "[ 49] A3B37549-1BA7-F6F3-EF74-D94645FB8168                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A3B37549-1BA7-F6F3-EF74-D94645FB8168\\libnetd_client.so \n" +
            "[ 50] E175D7CF-2604-0540-EABD-FBA5688B89F0                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\E175D7CF-2604-0540-EABD-FBA5688B89F0\\libsoundtrigger.so \n" +
            "[ 51] A9D7FD80-0425-00E9-6F5B-550943E4D567                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A9D7FD80-0425-00E9-6F5B-550943E4D567\\libminikin.so \n" +
            "[ 52] BDB8DD48-DCA0-ACC2-A98C-7B8B6D6D40BA                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\BDB8DD48-DCA0-ACC2-A98C-7B8B6D6D40BA\\libprocessgroup.so \n" +
            "[ 53] ADCD6D40-1587-E8C4-E39F-EA76F7F0681E                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\ADCD6D40-1587-E8C4-E39F-EA76F7F0681E\\libnativebridge.so \n" +
            "[ 54] 5386E5AE-5CC7-00A5-8C95-B30007CD6F71                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5386E5AE-5CC7-00A5-8C95-B30007CD6F71\\libmemunreachable.so \n" +
            "[ 55] 65875C94-2B9E-699F-B651-07F4965BFE58                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\65875C94-2B9E-699F-B651-07F4965BFE58\\libhidlbase.so \n" +
            "[ 56] 3B9A73C2-5DB0-54BD-C8EB-F81373139936                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\3B9A73C2-5DB0-54BD-C8EB-F81373139936\\libhidltransport.so \n" +
            "[ 57] D2D61CD7-7A4D-AF49-C354-9EDC12F0E805                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D2D61CD7-7A4D-AF49-C354-9EDC12F0E805\\libvintf.so \n" +
            "[ 58] 55B10A55-EF36-4174-212F-D24DFD434AD6                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\55B10A55-EF36-4174-212F-D24DFD434AD6\\libnativewindow.so \n" +
            "[ 59] E0A3AE8E-5FDF-FFFC-39D1-3DF3699B7B20                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\E0A3AE8E-5FDF-FFFC-39D1-3DF3699B7B20\\libhwui.so \n" +
            "[ 60] E0A575B7-C22C-786B-4E65-5C1D14024788                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\E0A575B7-C22C-786B-4E65-5C1D14024788\\libbacktrace.so \n" +
            "[ 61] 88D49132-50CD-836C-AEF2-1A0FACD8B03C                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\88D49132-50CD-836C-AEF2-1A0FACD8B03C\\libvndksupport.so \n" +
            "[ 62] 4A84FFDD-88F3-352F-A77F-C8BFAF780DAC                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\4A84FFDD-88F3-352F-A77F-C8BFAF780DAC\\libaudiomanager.so \n" +
            "[ 63] A16D6EAF-BD41-E845-03BC-2846F50CF78A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A16D6EAF-BD41-E845-03BC-2846F50CF78A\\libstagefright.so \n" +
            "[ 64] E0D3221A-CF67-8EA6-642D-B7B07E3A138E                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\E0D3221A-CF67-8EA6-642D-B7B07E3A138E\\libstagefright_foundation.so \n" +
            "[ 65] 408467B2-3EF3-DF5B-8F02-3F0844A60664                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\408467B2-3EF3-DF5B-8F02-3F0844A60664\\libstagefright_http_support.so \n" +
            "[ 66] 9AF70164-2455-B17E-BE47-EBCB4FFC4FBE                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\9AF70164-2455-B17E-BE47-EBCB4FFC4FBE\\android.hardware.memtrack@1.0.so \n" +
            "[ 67] 12961262-743A-62AD-65B9-1D4DAEA9A4C1                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\12961262-743A-62AD-65B9-1D4DAEA9A4C1\\android.hardware.graphics.allocator@2.0.so \n" +
            "[ 68] BFACA384-5C5D-EE15-C370-CCE6C4E72456                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\BFACA384-5C5D-EE15-C370-CCE6C4E72456\\android.hardware.graphics.mapper@2.0.so \n" +
            "[ 69] 97D30C19-69F3-A910-99F6-86C25966734B                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\97D30C19-69F3-A910-99F6-86C25966734B\\android.hardware.configstore@1.0.so \n" +
            "[ 70] 24AC4300-9A29-13EE-50F1-9397FA74EB9B                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\24AC4300-9A29-13EE-50F1-9397FA74EB9B\\android.hardware.configstore-utils.so \n" +
            "[ 71] 1C6B87C4-5E40-E1A7-97BF-31A9D74C9A65                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\1C6B87C4-5E40-E1A7-97BF-31A9D74C9A65\\libsync.so \n" +
            "[ 72] 935CA862-F8BD-DD6C-6110-C393690B9534                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\935CA862-F8BD-DD6C-6110-C393690B9534\\android.hidl.token@1.0-utils.so \n" +
            "[ 73] 1E6E935B-57F4-58D8-E4CA-658DEBCFEE58                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\1E6E935B-57F4-58D8-E4CA-658DEBCFEE58\\android.hardware.graphics.bufferqueue@1.0.so \n" +
            "[ 74] 09B4B620-660D-A761-09F4-8989B1F04D37                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\09B4B620-660D-A761-09F4-8989B1F04D37\\libdng_sdk.so \n" +
            "[ 75] D34E20C5-9E7F-9FE7-BD2E-5BC49BD8A830                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D34E20C5-9E7F-9FE7-BD2E-5BC49BD8A830\\libexpat.so \n" +
            "[ 76] BEF9E2D8-1F89-05F8-F6AF-4D098AB3CD37                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\BEF9E2D8-1F89-05F8-F6AF-4D098AB3CD37\\libft2.so \n" +
            "[ 77] 88B78ADE-B4BB-CD2C-EBC4-0E7680C9C71B                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\88B78ADE-B4BB-CD2C-EBC4-0E7680C9C71B\\libheif.so \n" +
            "[ 78] 1388D2D4-AFA1-E5BE-B8CF-3936E25E7200                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\1388D2D4-AFA1-E5BE-B8CF-3936E25E7200\\libicui18n.so \n" +
            "[ 79] B78F2283-E038-A861-0C01-52F8311DEF89                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B78F2283-E038-A861-0C01-52F8311DEF89\\libpiex.so \n" +
            "[ 80] 6168C849-49A3-91F6-5669-20AD4A319BAD                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\6168C849-49A3-91F6-5669-20AD4A319BAD\\libpng.so \n" +
            "[ 81] 5C15AC7C-3A67-C2EE-1FFA-3D18DDF7CFDD                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5C15AC7C-3A67-C2EE-1FFA-3D18DDF7CFDD\\libpcre2.so \n" +
            "[ 82] 9C2A19C2-39FC-A4C9-856C-D42BE5718A7B                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\9C2A19C2-39FC-A4C9-856C-D42BE5718A7B\\libpackagelistparser.so \n" +
            "[ 83] 79207F97-3889-2570-F470-C486CFFEEB5E                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\79207F97-3889-2570-F470-C486CFFEEB5E\\libclang_rt.ubsan_standalone-aarch64-android.so \n" +
            "[ 84] 2B21AE44-8CAF-8176-5CD0-76B067DEF137                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\2B21AE44-8CAF-8176-5CD0-76B067DEF137\\android.hardware.media.omx@1.0.so \n" +
            "[ 85] 4116B0BC-12E9-B221-B69D-D62EEEA259FD                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\4116B0BC-12E9-B221-B69D-D62EEEA259FD\\android.hardware.media@1.0.so \n" +
            "[ 86] D076C8DA-9DAD-A8C1-FECE-ABF28DB672BA                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D076C8DA-9DAD-A8C1-FECE-ABF28DB672BA\\libsonivox.so \n" +
            "[ 87] 3D78CB14-215C-971B-13CC-9C2700E9FAA4                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\3D78CB14-215C-971B-13CC-9C2700E9FAA4\\libaudioutils.so \n" +
            "[ 88] B561B6A5-95D5-2E4A-5281-7E5C43911C9E                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B561B6A5-95D5-2E4A-5281-7E5C43911C9E\\libmedia_helper.so \n" +
            "[ 89] 8662082B-CD3D-429C-F947-2DD69B7CBDD6                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\8662082B-CD3D-429C-F947-2DD69B7CBDD6\\libmediadrm.so \n" +
            "[ 90] 36C15439-9C91-5AB2-714E-2872FC183D43                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\36C15439-9C91-5AB2-714E-2872FC183D43\\libmediametrics.so \n" +
            "[ 91] 7379E8B0-A42C-A0ED-BAB1-B02F416FF13A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\7379E8B0-A42C-A0ED-BAB1-B02F416FF13A\\libhidlmemory.so \n" +
            "[ 92] A43B7746-DA93-974E-2301-4871753BAA8A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A43B7746-DA93-974E-2301-4871753BAA8A\\android.hidl.memory@1.0.so \n" +
            "[ 93] 78B088C9-DA8F-A9F0-E34B-B16ECA4CEE31                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\78B088C9-DA8F-A9F0-E34B-B16ECA4CEE31\\android.hardware.graphics.common@1.0.so \n" +
            "[ 94] C4014D22-90FF-333A-1444-F14C4175E6DF                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\C4014D22-90FF-333A-1444-F14C4175E6DF\\libtinyxml2.so \n" +
            "[ 95] CA806ADF-25A2-E61B-1ABA-DEEB29D211A9                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\CA806ADF-25A2-E61B-1ABA-DEEB29D211A9\\libprotobuf-cpp-lite.so \n" +
            "[ 96] 1ED0F9D9-8C37-CBB4-4771-F72CF5C87A2D                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\1ED0F9D9-8C37-CBB4-4771-F72CF5C87A2D\\libRScpp.so \n" +
            "[ 97] 39E13F45-1FE5-05F3-911F-CC47704905B7                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\39E13F45-1FE5-05F3-911F-CC47704905B7\\libunwind.so \n" +
            "[ 98] E3954E23-77FB-F3A0-DE64-F1A3DE72F86A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\E3954E23-77FB-F3A0-DE64-F1A3DE72F86A\\libdrmframework.so \n" +
            "[ 99] 03FC5DE8-4206-F57D-1422-F1838F2396B0                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\03FC5DE8-4206-F57D-1422-F1838F2396B0\\libmediautils.so \n" +
            "[100] A043859F-FA83-B518-34FF-1778DF1843D8                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A043859F-FA83-B518-34FF-1778DF1843D8\\libvorbisidec.so \n" +
            "[101] B847CDBD-43D4-2A89-9E0B-0D586DF8773F                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B847CDBD-43D4-2A89-9E0B-0D586DF8773F\\libstagefright_omx_utils.so \n" +
            "[102] 2CD3527F-D9A9-20EB-9EE9-6EEA7BE4528D                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\2CD3527F-D9A9-20EB-9EE9-6EEA7BE4528D\\libstagefright_flacdec.so \n" +
            "[103] 99B23DAA-A724-A5A6-87A5-CE553A702D8C                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\99B23DAA-A724-A5A6-87A5-CE553A702D8C\\libstagefright_xmlparser.so \n" +
            "[104] 6602D215-AA15-689B-A54F-2F5FB355ED5F                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\6602D215-AA15-689B-A54F-2F5FB355ED5F\\android.hidl.allocator@1.0.so \n" +
            "[105] 3D72FF06-D193-6CE1-C3B0-222E8EAD789D                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\3D72FF06-D193-6CE1-C3B0-222E8EAD789D\\android.hardware.cas@1.0.so \n" +
            "[106] AD9B6258-7BEB-D830-2741-B2F3D1C9A156                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\AD9B6258-7BEB-D830-2741-B2F3D1C9A156\\android.hardware.cas.native@1.0.so \n" +
            "[107] 308A3133-8D4E-7B0E-38AB-1C7E602F9200                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\308A3133-8D4E-7B0E-38AB-1C7E602F9200\\libpowermanager.so \n" +
            "[108] 306B49C0-BC94-F8FD-9251-7B3B025FA754                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\306B49C0-BC94-F8FD-9251-7B3B025FA754\\android.hidl.token@1.0.so \n" +
            "[109] B8AF190E-2111-2B7A-7234-6E04AAA21290                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B8AF190E-2111-2B7A-7234-6E04AAA21290\\libstdc++.so \n" +
            "[110] 0D27AF39-D527-0D82-1C2E-C48F8220D61D                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\0D27AF39-D527-0D82-1C2E-C48F8220D61D\\libspeexresampler.so \n" +
            "[111] 702D04EB-C5D1-7A63-9254-6AFF06A8B4DD                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\702D04EB-C5D1-7A63-9254-6AFF06A8B4DD\\android.hardware.drm@1.0.so \n" +
            "[112] 9DF140BA-9CE1-BD93-EEDC-297259A3C6AE                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\9DF140BA-9CE1-BD93-EEDC-297259A3C6AE\\liblzma.so \n" +
            "[113] 026CA97F-9CD9-54CF-DD45-4CCEE6CDF833                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\026CA97F-9CD9-54CF-DD45-4CCEE6CDF833\\libmedia_omx.so \n" +
            "[114] 4072AA45-4CFF-CAE6-1235-9BFD436F4052                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\4072AA45-4CFF-CAE6-1235-9BFD436F4052\\libart.so \n" +
            "[115] D792C0F8-2F02-2A96-8105-93C371100F2A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D792C0F8-2F02-2A96-8105-93C371100F2A\\liblz4.so \n" +
            "[116] 279653B9-376A-E193-D249-E5052DA14378                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\279653B9-376A-E193-D249-E5052DA14378\\libtombstoned_client.so \n" +
            "[117] EC820ABB-18EE-D779-45F1-9C776021902A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\EC820ABB-18EE-D779-45F1-9C776021902A\\libsigchain.so \n" +
            "[118] D704C79D-F207-44A7-F87C-2E7291898B1B-522169F2                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D704C79D-F207-44A7-F87C-2E7291898B1B-522169F2\\boot.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D704C79D-F207-44A7-F87C-2E7291898B1B-522169F2\\boot.oat.sym\n" +
            "[119] A4F56C2A-DD2F-16E4-F9D0-8AF054B1BE71-7190BC74                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A4F56C2A-DD2F-16E4-F9D0-8AF054B1BE71-7190BC74\\boot-core-libart.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A4F56C2A-DD2F-16E4-F9D0-8AF054B1BE71-7190BC74\\boot-core-libart.oat.sym\n" +
            "[120] 0C303F82-BD6B-93E4-DAD3-049FEA8B3D44-A60158BC                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\0C303F82-BD6B-93E4-DAD3-049FEA8B3D44-A60158BC\\boot-conscrypt.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\0C303F82-BD6B-93E4-DAD3-049FEA8B3D44-A60158BC\\boot-conscrypt.oat.sym\n" +
            "[121] 391BD44B-0234-FA92-3350-1DE364108A44-AA9B8FEA                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\391BD44B-0234-FA92-3350-1DE364108A44-AA9B8FEA\\boot-okhttp.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\391BD44B-0234-FA92-3350-1DE364108A44-AA9B8FEA\\boot-okhttp.oat.sym\n" +
            "[122] B676C155-0CF4-C67D-5469-0912C5F9FF3A-5BE12E3E                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B676C155-0CF4-C67D-5469-0912C5F9FF3A-5BE12E3E\\boot-bouncycastle.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B676C155-0CF4-C67D-5469-0912C5F9FF3A-5BE12E3E\\boot-bouncycastle.oat.sym\n" +
            "[123] AD8EECDC-E2AC-C471-F4D9-C543B8F375B8-9456B355                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\AD8EECDC-E2AC-C471-F4D9-C543B8F375B8-9456B355\\boot-apache-xml.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\AD8EECDC-E2AC-C471-F4D9-C543B8F375B8-9456B355\\boot-apache-xml.oat.sym\n" +
            "[124] 92B84147-576E-A1DA-CFD3-B232C265C00A-54AA0F97                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\92B84147-576E-A1DA-CFD3-B232C265C00A-54AA0F97\\boot-legacy-test.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\92B84147-576E-A1DA-CFD3-B232C265C00A-54AA0F97\\boot-legacy-test.oat.sym\n" +
            "[125] 9365DE24-210D-2057-3E7E-BB5825EF3554-4AE61635                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\9365DE24-210D-2057-3E7E-BB5825EF3554-4AE61635\\boot-ext.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\9365DE24-210D-2057-3E7E-BB5825EF3554-4AE61635\\boot-ext.oat.sym\n" +
            "[126] 69ECC3CC-533C-5D28-2E67-77B8A98E0DF0-F064D0F3                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\69ECC3CC-533C-5D28-2E67-77B8A98E0DF0-F064D0F3\\boot-framework.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\69ECC3CC-533C-5D28-2E67-77B8A98E0DF0-F064D0F3\\boot-framework.oat.sym\n" +
            "[127] 0EF451C9-3172-249B-CA71-5AB2806A2074-62A66762                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\0EF451C9-3172-249B-CA71-5AB2806A2074-62A66762\\boot-telephony-common.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\0EF451C9-3172-249B-CA71-5AB2806A2074-62A66762\\boot-telephony-common.oat.sym\n" +
            "[128] 5300DDFC-37BF-13AC-0F64-F97F1137CEBE-A4D2DB6A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5300DDFC-37BF-13AC-0F64-F97F1137CEBE-A4D2DB6A\\boot-voip-common.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5300DDFC-37BF-13AC-0F64-F97F1137CEBE-A4D2DB6A\\boot-voip-common.oat.sym\n" +
            "[129] B8347C70-D4F1-AA7F-FBC4-CD26740B889D-A18E5588                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B8347C70-D4F1-AA7F-FBC4-CD26740B889D-A18E5588\\boot-ims-common.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B8347C70-D4F1-AA7F-FBC4-CD26740B889D-A18E5588\\boot-ims-common.oat.sym\n" +
            "[130] B903660B-C8BA-4DF7-E611-0A543082696E-F71B0E68                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B903660B-C8BA-4DF7-E611-0A543082696E-F71B0E68\\boot-org.apache.http.legacy.boot.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B903660B-C8BA-4DF7-E611-0A543082696E-F71B0E68\\boot-org.apache.http.legacy.boot.oat.sym\n" +
            "[131] B3D508C9-34CE-B242-20E5-DC0F425A22A4-CC3CC3B7                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B3D508C9-34CE-B242-20E5-DC0F425A22A4-CC3CC3B7\\boot-android.hidl.base-V1.0-java.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B3D508C9-34CE-B242-20E5-DC0F425A22A4-CC3CC3B7\\boot-android.hidl.base-V1.0-java.oat.sym\n" +
            "[132] 765817A5-4067-C93A-DAA4-767DF69755ED-2D4D991E                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\765817A5-4067-C93A-DAA4-767DF69755ED-2D4D991E\\boot-android.hidl.manager-V1.0-java.oat \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\765817A5-4067-C93A-DAA4-767DF69755ED-2D4D991E\\boot-android.hidl.manager-V1.0-java.oat.sym\n" +
            "[133] 29097742-4267-2C07-CF97-27C67B742FA9                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\29097742-4267-2C07-CF97-27C67B742FA9\\libandroid.so \n" +
            "[134] BCBF1621-A3BF-8675-35F5-BB2A38F1CB34                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\BCBF1621-A3BF-8675-35F5-BB2A38F1CB34\\libaaudio.so \n" +
            "[135] 5DE44AF9-17BB-556F-75D3-963393A7DB23                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5DE44AF9-17BB-556F-75D3-963393A7DB23\\libcamera2ndk.so \n" +
            "[136] 8875FA56-7469-3310-9AAF-EEA6616ED948                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\8875FA56-7469-3310-9AAF-EEA6616ED948\\libmediandk.so \n" +
            "[137] D50B93C6-ED7D-854F-737A-70ADAF298857                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D50B93C6-ED7D-854F-737A-70ADAF298857\\libmedia_jni.so \n" +
            "[138] A4081AE9-E41A-B44D-EF4B-60BFE579B73A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A4081AE9-E41A-B44D-EF4B-60BFE579B73A\\libmidi.so \n" +
            "[139] AEA2F821-9197-A6F3-5A57-E35544D891C4                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\AEA2F821-9197-A6F3-5A57-E35544D891C4\\libmtp.so \n" +
            "[140] 5AFF2EDC-97A8-5C3D-912F-69F68285C36C                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5AFF2EDC-97A8-5C3D-912F-69F68285C36C\\libexif.so \n" +
            "[141] 8C4C8630-A4CF-DD39-B4E6-7822B52941FA                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\8C4C8630-A4CF-DD39-B4E6-7822B52941FA\\libGLESv3.so \n" +
            "[142] 122543E0-AA72-17EF-F718-A2FE6B7B9885                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\122543E0-AA72-17EF-F718-A2FE6B7B9885\\libjnigraphics.so \n" +
            "[143] C96B37D4-1FF0-6718-5929-6F2E7818DBFA                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\C96B37D4-1FF0-6718-5929-6F2E7818DBFA\\libneuralnetworks.so \n" +
            "[144] 5D938E99-4970-2511-336E-C8462CF71F19                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5D938E99-4970-2511-336E-C8462CF71F19\\libtextclassifier_hash.so \n" +
            "[145] 22735279-46A4-5B54-4088-00A03143BD90                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\22735279-46A4-5B54-4088-00A03143BD90\\android.hardware.neuralnetworks@1.0.so \n" +
            "[146] 6EB0AFEA-C0B5-8CEA-8C71-8DA996D4A44C                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\6EB0AFEA-C0B5-8CEA-8C71-8DA996D4A44C\\libOpenMAXAL.so \n" +
            "[147] E06CAE4A-53D3-16DE-1C74-E672658FC6A0                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\E06CAE4A-53D3-16DE-1C74-E672658FC6A0\\libOpenSLES.so \n" +
            "[148] 435AA7CB-2E80-02A2-F2CD-76B65F4EC4BD                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\435AA7CB-2E80-02A2-F2CD-76B65F4EC4BD\\libRS.so \n" +
            "[149] 428F6DDE-D3BC-F529-2631-B33729F98AF2                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\428F6DDE-D3BC-F529-2631-B33729F98AF2\\android.hardware.renderscript@1.0.so \n" +
            "[150] 06956541-CD59-8DEB-09C9-46E9F55B8541                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\06956541-CD59-8DEB-09C9-46E9F55B8541\\libwebviewchromium_plat_support.so \n" +
            "[151] 5BD57987-B19A-A310-EBC3-429A75D9B55D                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5BD57987-B19A-A310-EBC3-429A75D9B55D\\libjavacore.so \n" +
            "[152] 81F98C4B-0578-5A41-E5BC-E148B644BB5F                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\81F98C4B-0578-5A41-E5BC-E148B644BB5F\\libopenjdk.so \n" +
            "[153] 90F17A47-8A26-A4B2-157B-F26BAF176F2A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\90F17A47-8A26-A4B2-157B-F26BAF176F2A\\libssl.so \n" +
            "[154] 28511128-EFD9-41C2-1B7F-704F54DE4443                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\28511128-EFD9-41C2-1B7F-704F54DE4443\\libopenjdkjvm.so \n" +
            "[155] C33AF88C-FE3E-F40A-3527-721091ACB6FE                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\C33AF88C-FE3E-F40A-3527-721091ACB6FE\\libart-compiler.so \n" +
            "[156] A1B695BF-87D0-DEB3-D0E2-70DEFD89EB92                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A1B695BF-87D0-DEB3-D0E2-70DEFD89EB92\\libart-dexlayout.so \n" +
            "[157] 30C24C41-8078-65DD-3BE7-AF50477DAC00                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\30C24C41-8078-65DD-3BE7-AF50477DAC00\\libvixl-arm.so \n" +
            "[158] A1A530F6-2639-D9A0-300A-C981CE6650FA                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\A1A530F6-2639-D9A0-300A-C981CE6650FA\\libvixl-arm64.so \n" +
            "[159] BD29901A-F1B0-3F12-56EE-D4DA3273866C                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\BD29901A-F1B0-3F12-56EE-D4DA3273866C\\libsoundpool.so \n" +
            "[160] 9892BE7B-3DD2-85CD-82A4-7E33CD21B457                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\9892BE7B-3DD2-85CD-82A4-7E33CD21B457\\libjavacrypto.so \n" +
            "[161] 1EA99072-5AB1-2CE2-23AA-F95D018C3A9C                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\1EA99072-5AB1-2CE2-23AA-F95D018C3A9C\\android.hardware.graphics.mapper@2.0.so \n" +
            "[162] 4C4F4F1D-6A29-2BE7-573A-27D96154523B                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\4C4F4F1D-6A29-2BE7-573A-27D96154523B\\libhidlbase.so \n" +
            "[163] 770E4977-27D9-5BF5-687A-84ED9A268236                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\770E4977-27D9-5BF5-687A-84ED9A268236\\libhidltransport.so \n" +
            "[164] 747A682A-055B-134F-1F2D-15E1041C2786                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\747A682A-055B-134F-1F2D-15E1041C2786\\libhwbinder.so \n" +
            "[165] 5B26381E-0476-8A55-FCB4-2ADB941CA2BD                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\5B26381E-0476-8A55-FCB4-2ADB941CA2BD\\libutils.so \n" +
            "[166] 7B3514AA-67FB-69C1-75EF-003C6EA53E2B                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\7B3514AA-67FB-69C1-75EF-003C6EA53E2B\\libcutils.so \n" +
            "[167] 630CAA0D-C35F-40A5-E256-0BFB9BF8277C                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\630CAA0D-C35F-40A5-E256-0BFB9BF8277C\\android.hardware.graphics.common@1.0.so \n" +
            "[168] CF93C597-DDF6-E124-FF9F-E029256B8DF4                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\CF93C597-DDF6-E124-FF9F-E029256B8DF4\\libc++.so \n" +
            "[169] 0DD327DE-67E5-C2B3-9160-D425472362C0                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\0DD327DE-67E5-C2B3-9160-D425472362C0\\libbase.so \n" +
            "[170] 6D1C6834-0679-3C87-5563-7347FAC39094                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\6D1C6834-0679-3C87-5563-7347FAC39094\\libbacktrace.so \n" +
            "[171] 07B5AF2E-02EE-DF3D-6F44-64C299B6AEC2                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\07B5AF2E-02EE-DF3D-6F44-64C299B6AEC2\\libunwind.so \n" +
            "[172] DA507DE1-F05D-70E0-1519-AFAACB57F6D1                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\DA507DE1-F05D-70E0-1519-AFAACB57F6D1\\liblzma.so \n" +
            "[173] DED89216-CAE5-7CD3-4815-520F5897B58B                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\DED89216-CAE5-7CD3-4815-520F5897B58B\\libhardware.so \n" +
            "[174] 69F934C5-6511-4571-59EC-186A732AD05E                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\69F934C5-6511-4571-59EC-186A732AD05E\\android.hardware.graphics.mapper@2.0-impl.so \n" +
            "[175] DD316564-24DF-7022-9DC8-AB0AB82031F3                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\DD316564-24DF-7022-9DC8-AB0AB82031F3\\libcompiler_rt.so \n" +
            "[176] AC31B326-82FD-A343-268F-FCAA0B6CA4D6                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\AC31B326-82FD-A343-268F-FCAA0B6CA4D6\\libwebviewchromium_loader.so \n" +
            "[177] CD35BC7A-0000-0000-0000-000000000000                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\CD35BC7A-0000-0000-0000-000000000000\\base.odex \n" +
            "      C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\CD35BC7A-0000-0000-0000-000000000000\\base.odex.sym\n" +
            "[178] B1C487F2-E97D-4101-0439-F86F651A5E80                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\B1C487F2-E97D-4101-0439-F86F651A5E80\\libz.so \n" +
            "[179] 6FAEBBBB-0000-0000-0000-000000000000                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\6FAEBBBB-0000-0000-0000-000000000000\\libEGL_adreno.so \n" +
            "[180] D7E68D2F-0000-0000-0000-000000000000                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D7E68D2F-0000-0000-0000-000000000000\\libadreno_utils.so \n" +
            "[181] 9C534A98-0000-0000-0000-000000000000                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\9C534A98-0000-0000-0000-000000000000\\libgsl.so \n" +
            "[182] D8AC245D-0000-0000-0000-000000000000                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\D8AC245D-0000-0000-0000-000000000000\\libGLESv2_adreno.so \n" +
            "[183] 95D06E3F-4A1D-C7B5-ED5A-50B68507E1FD                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\95D06E3F-4A1D-C7B5-ED5A-50B68507E1FD\\libllvm-glnext.so \n" +
            "[184] 00832CD9-0000-0000-0000-000000000000                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\00832CD9-0000-0000-0000-000000000000\\libGLESv1_CM_adreno.so \n" +
            "[185] 8BDA9FA3-0000-0000-0000-000000000000                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\8BDA9FA3-0000-0000-0000-000000000000\\eglSubDriverAndroid.so \n" +
            "[186] 8D91D73C-33E8-7425-CB55-B3A8AEA0ACFA                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\8D91D73C-33E8-7425-CB55-B3A8AEA0ACFA\\gralloc.msm8998.so \n" +
            "[187] 53C83763-2111-C018-BE2D-3221C8019D7F                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\53C83763-2111-C018-BE2D-3221C8019D7F\\libqdMetaData.so \n" +
            "[188] FD06DCDE-694C-F6AA-3D9E-3AAF1BB0A066                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\FD06DCDE-694C-F6AA-3D9E-3AAF1BB0A066\\libdrmutils.so \n" +
            "[189] EB33817E-8CD1-5986-E33E-690065BB916A                    C:\\Users\\P7XXTM1-G\\.lldb\\module_cache\\remote-android\\.cache\\EB33817E-8CD1-5986-E33E-690065BB916A\\libdrm.so ";

    public static void main(String[] args) {
        File aospSymbolFile = new File("G:\\opensource\\Github\\aosp_host\\app\\aosp\\symbols");
        deleteUselessSymbols(aospSymbolFile);
        deleteEmptyDir(aospSymbolFile);

        StringBuilder command = new StringBuilder();
        command.append("add-dsym ");
        visitSymbols(aospSymbolFile, command);
        System.out.println(command);
    }

    public static void visitSymbols(File director, StringBuilder command) {
        File[] fs = director.listFiles();
        for (File f : fs) {
            if (f.isDirectory()) {
                boolean visit = true;
                for (String ignore : IGNORE_DIR) {
                    if (ignore.equals(f.getName())) {
                        visit = false;
                        break;
                    } else if (f.getAbsolutePath().indexOf(ignore) >= 0) {
                        visit = false;
                        break;
                    }
                }
                if (visit)
                    visitSymbols(f, command);
                continue;
            }
            if (f.isFile()) {
                boolean append = true;
                for (String ignore : IGNORE) {
                    if (ignore.equals(f.getName())) {
                        append = false;
                        break;
                    }
                }
                if (append) {
                    command.append(f.getAbsolutePath());
                    command.append(CHAR_SPACE);
                }
            }
        }
    }

    public static void deleteUselessSymbols(File director) {
        File[] fs = director.listFiles();
        for (File f : fs) {
            if (f.isDirectory()) {
                deleteUselessSymbols(f);
                continue;
            }
            if (f.isFile()) {
                if (DEVICES_IMAGE_LIST.indexOf(f.getName()) < 0) {
                    f.delete();
                }
            }
        }
    }

    public static void deleteEmptyDir(File director) {
        File[] fs = director.listFiles();
        for (File f : fs) {
            if (f.isDirectory()) {
                if (f.listFiles().length == 0) {
                    f.delete();
                    deleteEmptyDir(f.getParentFile());
                } else {
                    deleteEmptyDir(f);
                }
                continue;
            }
        }
    }
}
