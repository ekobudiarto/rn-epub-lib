
Pod::Spec.new do |s|
  s.name         = "RNEPubLib"
  s.version      = "1.0.0"
  s.summary      = "RNEPubLib"
  s.description  = "React Native Brigde for ePub"
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "ekobudiartoy@gmail.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNEPubLib.git", :tag => "master" }
  s.source_files  = "RNEPubLib/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  