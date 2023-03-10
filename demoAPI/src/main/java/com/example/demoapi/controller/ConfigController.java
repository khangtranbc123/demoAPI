package com.example.demoapi.controller;

import com.example.demoapi.model.CuoiKy;
import com.example.demoapi.model.DauKy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;

@RestController
@RequestMapping("/api")
public class configController {
    @GetMapping("/get-data")
    public String getData(){
        String data = " double thuNhapKhac_; Double\n" +
                "           chiPhiKhac_; Double\n" +
                "           bdsdauTu154_; Double\n" +
                "           nguyenGia158_; Double\n" +
                "           noPhaiTra300_; Double\n" +
                "           nguyenGia151_; Double\n" +
                "           tienTonDauKy_; Double\n" +
                "           tienMuaTSCD_; Double\n" +
                "           lcttuHDDT_; Double\n" +
                "           loiNhuanKhac_; Double\n" +
                "           dauTuTaiChinh111_; Double\n" +
                "           giaTriHaoMonLuyKe159_; Double\n" +
                "           phaiTraNoiBo317_; Double\n" +
                "           vayVaNoThueTC316_; Double\n" +
                "           duPhongPhaiTra318_; Double\n" +
                "           taiSanCoDinh150_; Double\n" +
                "           duPhongPhaiThuKhoDoi139_; Double\n" +
                "           hangTonKho141_; Double\n" +
                "           xdcbdoDang210_; Double\n" +
                "           dauTuNamGiuDenNgayDaoHan120_; Double\n" +
                "           dauTuGopVonVaoDVK121_; Double\n" +
                "           thueGTGTDuocKhauTru212_; Double\n" +
                "           vonDauTuCuaCSH411_; Double\n" +
                "           thangDuVonCoPhan412_; Double\n" +
                "           traTruocChoNguoiBan132_; Double\n" +
                "           nguoiMuaTraTienTruoc312_; Double\n" +
                "           tienVaCacKhoanTuongDuong110_; Double\n" +
                "           taiSanThieuChoXuLy135_; Double\n" +
                "           phaiTraNguoiBan311_; Double\n" +
                "           duPhongGiamGiaHTK149_; Double\n" +
                "           taiSanKhac211_; Double\n" +
                "           vonKinhDoanhDVTrucThuoc133_; Double\n" +
                "           hangTonKho140_; Double\n" +
                "           thueVaCacKhoanPhaiNopNN313_; Double\n" +
                "           duPhongTonThatDTTC129_; Double\n" +
                "           phaiThuCuaKhachHang131_; Double\n" +
                "           chungKhoanKinhDoanh112_; Double\n" +
                "           phaiTraNguoiLaoDong314_; Double\n" +
                "           taiSanKhac213_; Double\n" +
                "           phaiTraKhac315_; Double\n" +
                "           quyKhenThuongPhucLoi319_; Double\n" +
                "           quyPhatTrienKHCN320_; Double\n" +
                "           vonChuSoHuu400_; Double\n" +
                "           tongConTaiSan200_; Double\n" +
                "           phaiThuKhac134_; Double\n" +
                "           giaTriHaoMonLuyKe152_; Double\n" +
                "           cacKhoanPhaiThu130_; Double\n" +
                "           chenhLechTyGiaHoiDoai415_; Double\n" +
                "           chiPhiThueTNDNHienHanh_; Double\n" +
                "           chiPhiHoatDongTaiChinh_; Double\n" +
                "           dtthuanVeBanHangVaCungCapDV_; Double\n" +
                "           giaVonBanhang_; Double\n" +
                "           chiPhiLaiVay_LCTT_GianTiep_; Double\n" +
                "           coPhieuQuy414_; Double\n" +
                "           cacKhoanDieuChinhKhac_; Double\n" +
                "           tangGiamHangTonKho_; Double\n" +
                "           cacKhoanDuPhong_; Double\n" +
                "           tangGiamCacKhoanPhaiThu_; Double\n" +
                "           tangGiamCacKhoanPhaiTra_; Double\n" +
                "           chiPhiThueTNDNHoanLai_; Double\n" +
                "           loiIchCuaCoDongKhongKiemSoat_; Double\n" +
                "           loiNhuanSauThueTNDN_; Double\n" +
                "           lnthuanTuHDKD_; Double\n" +
                "           loiNhuanTruocThue_; Double\n" +
                "           laiSuyGiamTrenCoPhieu_; Double\n" +
                "           cacKhoanGiamTruDoanhThu_; Double\n" +
                "           chiPhiQuanLyDoanhNghiep_; Double\n" +
                "           loiNhuanSauThueCuaCongTyMe_; Double\n" +
                "           lngopVeBanHangVaCungCapDV_; Double\n" +
                "           cacQuyThuocVonCSH416_; Double\n" +
                "           vonKhacCuaCSH413_; Double\n" +
                "           tongLoiNhuanKeToanTruocThue_; Double\n" +
                "           laiCoBanTrenCoPhieu_; Double\n" +
                "           doanhThuBanHangVaCungCapDV_; Double\n" +
                "           dieuChinhChoCacKhoan_; Double\n" +
                "           chiPhiLaiVay_KQKD_; Double\n" +
                "           khauHaoTaiSanCoDinh_; Double\n" +
                "           laiLoTuHoatDongDauTu_; Double\n" +
                "           tongCongNguonVon500_; Double\n" +
                "           doanhThuHoatDongTaiChinh_; Double\n" +
                "           chiPhiBanHang_; Double\n" +
                "           laiLoCongTyLKLD_; Double\n" +
                "           thueTNDNDaNop_; Double\n" +
                "           lctthuanTuHDKD_; Double\n" +
                "           anhHuongCuaThayDoiTyGia_; Double\n" +
                "           tienChiDauTuGopVonVaoDVK_; Double\n" +
                "           tienVaTuongDuongTienDauKy_; Double\n" +
                "           tangGiamChungKhoanKinhDoanh_; Double\n" +
                "           tangGiamChiPhiTraTruoc_; Double\n" +
                "           tienVaTuongDuongTienCuoiKy_; Double\n" +
                "           tienThuHoiDauTuVonVaoDVK_; Double\n" +
                "           tienChiVonGopChoCSH_; Double\n" +
                "           thueThuNhapDoanhNghiepDaNop_; Double\n" +
                "           tienThuTuDiVay_; Double\n" +
                "           tienTraChoNguoiCungCapHHDV_; Double\n" +
                "           tienTraNoGocVay_; Double\n" +
                "           tienTraNoGocThueTC_; Double\n" +
                "           lctthuanTuHDTC_; Double\n" +
                "           tienTonCuoiKy_; Double\n" +
                "           tienChiTraNoThueTaiChinh_; Double\n" +
                "           tienTraChoNguoiLaoDong_; Double\n" +
                "           tienChiTraNoGocVay_; Double\n" +
                "           tienChiKhacChoHDKD_; Double\n" +
                "           tienThuThanhLyNhuongBanTSCD_; Double\n" +
                "           tienChiChoVayMuaCongCuNoDVK_; Double\n" +
                "           thuTienBanHang_; Double\n" +
                "           coTucLoiNhuanTraChoCSH_; Double\n" +
                "           tienThuKhacTuHDKD_; Double\n" +
                "           lctthuanTrongKy_; Double\n" +
                "           tienChiTraVonGopChoCSH_; Double\n" +
                "           luuChuyenTienThuanTrongKy_; Double\n" +
                "           tienVayNganHanDaiHanNhanDuoc_; Double\n" +
                "           loiNhuanSauThueChuaPhanPhoi417_; Double\n" +
                "           tienThuKhacTuHoatDongKinhDoanh_; Double\n" +
                "           tienChiKhacChoHoatDongKinhDoanh_; Double\n" +
                "           luuChuyenTienThuanTuHoatDongKinhDoanh_; Double\n" +
                "           laiLoChenhLechTyGiaHoiDoaiChuaThucHien_; Double\n" +
                "           tienThuTuThanhLyNhuongBanTSCDVaTSDaiHanKhac_; Double\n" +
                "           tienLaiVayDaTra_LCTT_GianTiep_; Double\n" +
                "           loiNhuanTuHoatDongKinhDoanhTruocThayDoiVLD_; Double\n" +
                "           tienChiDeMuaSamXayDungTSCDVaTSDaiHanKhac_; Double\n" +
                "           tienChiChoVayMuaCacCongCuNoCuaDonViKhac_; Double\n" +
                "           tienThuLaiChoVayCoTucVaLoiNhuanDuocChia_; Double\n" +
                "           tienThuTuPhatHanhCoPhieuNhanVonGopCuaCSH_; Double\n" +
                "           luuChuyenTienThuanTuHoatDongTaiChinh_; Double\n" +
                "           tienLaiVayDaTra_LCTT_TrucTiep_; Double\n" +
                "           tienThuHoiChoVayBanLaiCongCuNoDVK_; Double\n" +
                "           tienChiDauTuGopVonVaoDonViKhac_; Double\n" +
                "           thuLaiTienChoVayCoTucVaLNDuocChia_; Double\n" +
                "           tienThuHoiChoVayBanLaiCacCongCuNoCuaDVK_; Double\n" +
                "           coTucLoiNhuanDaTraChoChuSoHuu_; Double\n" +
                "           tienThuHoiDauTuGopVonVaoDonViKhac_; Double\n" +
                "           anhHuongThayDoiTyGiaHoiDoaiQuyDoiNgoaiTe_; Double\n" +
                "           luuChuyenTienThuanTuHoatDongDauTu_; Double\n" +
                "           tienThuTuPhatHanhCPNhanVonGopCSH_;";

 //      String data2 = data.replaceAll("String","").replaceAll(";", ",");
       String data2 = data.replaceAll("Double","double");
//       String data3 = data2.replaceAll(";","\",");
//        String data5 = data4.replaceAll("\"","");
//        String data6 = data5.replaceAll("0.0","");
        String [] a = {" thuNhapKhac_", "chiPhiKhac_",
                "bdsdauTu154_", "nguyenGia158_", "noPhaiTra300_", "nguyenGia151_", "tienTonDauKy_", "tienMuaTSCD_", "lcttuHDDT_", "loiNhuanKhac_", "dauTuTaiChinh111_", "giaTriHaoMonLuyKe159_", "phaiTraNoiBo317_", "vayVaNoThueTC316_", "duPhongPhaiTra318_", "taiSanCoDinh150_", "duPhongPhaiThuKhoDoi139_", "hangTonKho141_", "xdcbdoDang210_", "dauTuNamGiuDenNgayDaoHan120_", "dauTuGopVonVaoDVK121_", "thueGTGTDuocKhauTru212_", "vonDauTuCuaCSH411_", "thangDuVonCoPhan412_", "traTruocChoNguoiBan132_", "nguoiMuaTraTienTruoc312_", "tienVaCacKhoanTuongDuong110_", "taiSanThieuChoXuLy135_", "phaiTraNguoiBan311_", "duPhongGiamGiaHTK149_", "taiSanKhac211_", "vonKinhDoanhDVTrucThuoc133_", "hangTonKho140_", "thueVaCacKhoanPhaiNopNN313_", "duPhongTonThatDTTC129_", "phaiThuCuaKhachHang131_", "chungKhoanKinhDoanh112_", "phaiTraNguoiLaoDong314_", "taiSanKhac213_", "phaiTraKhac315_", "quyKhenThuongPhucLoi319_", "quyPhatTrienKHCN320_", "vonChuSoHuu400_", "tongConTaiSan200_", "phaiThuKhac134_", "giaTriHaoMonLuyKe152_", "cacKhoanPhaiThu130_", "chenhLechTyGiaHoiDoai415_", "chiPhiThueTNDNHienHanh_", "chiPhiHoatDongTaiChinh_", "dtthuanVeBanHangVaCungCapDV_", "giaVonBanhang_", "chiPhiLaiVay_LCTT_GianTiep_", "coPhieuQuy414_", "cacKhoanDieuChinhKhac_", "tangGiamHangTonKho_", "cacKhoanDuPhong_", "tangGiamCacKhoanPhaiThu_", "tangGiamCacKhoanPhaiTra_", "chiPhiThueTNDNHoanLai_", "loiIchCuaCoDongKhongKiemSoat_", "loiNhuanSauThueTNDN_", "lnthuanTuHDKD_", "loiNhuanTruocThue_", "laiSuyGiamTrenCoPhieu_", "cacKhoanGiamTruDoanhThu_", "chiPhiQuanLyDoanhNghiep_", "loiNhuanSauThueCuaCongTyMe_", "lngopVeBanHangVaCungCapDV_", "cacQuyThuocVonCSH416_", "vonKhacCuaCSH413_", "tongLoiNhuanKeToanTruocThue_", "laiCoBanTrenCoPhieu_", "doanhThuBanHangVaCungCapDV_", "dieuChinhChoCacKhoan_", "chiPhiLaiVay_KQKD_", "khauHaoTaiSanCoDinh_", "laiLoTuHoatDongDauTu_", "tongCongNguonVon500_", "doanhThuHoatDongTaiChinh_", "chiPhiBanHang_", "laiLoCongTyLKLD_", "thueTNDNDaNop_", "lctthuanTuHDKD_", "anhHuongCuaThayDoiTyGia_", "tienChiDauTuGopVonVaoDVK_", "tienVaTuongDuongTienDauKy_", "tangGiamChungKhoanKinhDoanh_", "tangGiamChiPhiTraTruoc_", "tienVaTuongDuongTienCuoiKy_", "tienThuHoiDauTuVonVaoDVK_", "tienChiVonGopChoCSH_", "thueThuNhapDoanhNghiepDaNop_", "tienThuTuDiVay_", "tienTraChoNguoiCungCapHHDV_", "tienTraNoGocVay_", "tienTraNoGocThueTC_", "lctthuanTuHDTC_", "tienTonCuoiKy_", "tienChiTraNoThueTaiChinh_", "tienTraChoNguoiLaoDong_", "tienChiTraNoGocVay_", "tienChiKhacChoHDKD_", "tienThuThanhLyNhuongBanTSCD_", "tienChiChoVayMuaCongCuNoDVK_", "thuTienBanHang_", "coTucLoiNhuanTraChoCSH_", "tienThuKhacTuHDKD_", "lctthuanTrongKy_", "tienChiTraVonGopChoCSH_", "luuChuyenTienThuanTrongKy_", "tienVayNganHanDaiHanNhanDuoc_", "loiNhuanSauThueChuaPhanPhoi417_", "tienThuKhacTuHoatDongKinhDoanh_", "tienChiKhacChoHoatDongKinhDoanh_", "luuChuyenTienThuanTuHoatDongKinhDoanh_", "laiLoChenhLechTyGiaHoiDoaiChuaThucHien_", "tienThuTuThanhLyNhuongBanTSCDVaTSDaiHanKhac_", "tienLaiVayDaTra_LCTT_GianTiep_", "loiNhuanTuHoatDongKinhDoanhTruocThayDoiVLD_", "tienChiDeMuaSamXayDungTSCDVaTSDaiHanKhac_", "tienChiChoVayMuaCacCongCuNoCuaDonViKhac_", "tienThuLaiChoVayCoTucVaLoiNhuanDuocChia_", "tienThuTuPhatHanhCoPhieuNhanVonGopCuaCSH_", "luuChuyenTienThuanTuHoatDongTaiChinh_", "tienLaiVayDaTra_LCTT_TrucTiep_", "tienThuHoiChoVayBanLaiCongCuNoDVK_", "tienChiDauTuGopVonVaoDonViKhac_", "thuLaiTienChoVayCoTucVaLNDuocChia_", "tienThuHoiChoVayBanLaiCacCongCuNoCuaDVK_", "coTucLoiNhuanDaTraChoChuSoHuu_", "tienThuHoiDauTuGopVonVaoDonViKhac_", "anhHuongThayDoiTyGiaHoiDoaiQuyDoiNgoaiTe_", "luuChuyenTienThuanTuHoatDongDauTu_", "tienThuTuPhatHanhCPNhanVonGopCSH_" };
        for ( String i : a ){
            String firt = i.substring(0, 1);
            String last = i.substring(1, i.length());
            String name = firt.toUpperCase() + last;
            System.out.println("cuoiKy.set" + name + "(11);");
        }
        DauKy dauKy = new DauKy();
        dauKy.setBdsdauTu154(null);
        //System.out.println(a[1]);
        return data2;
    }
}
