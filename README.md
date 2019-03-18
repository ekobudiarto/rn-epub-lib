
# react-native-e-pub-lib

## Getting started

`$ npm install react-native-e-pub-lib --save`

### Mostly automatic installation

`$ react-native link react-native-e-pub-lib`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-e-pub-lib` and add `RNEPubLib.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNEPubLib.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNEPubLibPackage;` to the imports at the top of the file
  - Add `new RNEPubLibPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-e-pub-lib'
  	project(':react-native-e-pub-lib').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-e-pub-lib/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-e-pub-lib')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNEPubLib.sln` in `node_modules/react-native-e-pub-lib/windows/RNEPubLib.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using E.Pub.Lib.RNEPubLib;` to the usings at the top of the file
  - Add `new RNEPubLibPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNEPubLib from 'react-native-e-pub-lib';

// TODO: What to do with the module?
RNEPubLib;
```
  